package cn.edu.tongji.team.patterns.chainofresponsibility;

import cn.edu.tongji.team.model.beans.grade.*;
import cn.edu.tongji.team.model.beans.worker.Manager;
import cn.edu.tongji.team.patterns.specification.Specification;
import cn.edu.tongji.team.util.UI;
import org.junit.Test;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/12/4,22:20
 * Version: 1.0
 */
public class ChainOfResponsibilityTest {
        static private Grade getManager(GradeType gradeType){
            Grade manager;
            switch (gradeType){
                case Junior:
                    manager = new Junior(new Manager("小叶"));
                    break;
                case Senior:
                    manager = new Senior(new Manager("小黄"));
                    break;
                case Master:
                    manager = new Master(new Manager("小蓝"));
                    break;
                default:
                    manager = new Junior(new Manager("小叶"));
            }
            return manager;
        }


        static private ResponsibleHandler getChainOfManagers(int spoiledKilogram){

            ResponsibleHandler juniorManager = new JuniorManager(spoiledKilogram, getManager(GradeType.Junior));
            ResponsibleHandler masterManager = new MasterManager(spoiledKilogram, getManager(GradeType.Master));
            ResponsibleHandler seniorManager = new SeniorManager(spoiledKilogram, getManager(GradeType.Senior));

            juniorManager.setNextHandler(masterManager);
            masterManager.setNextHandler(seniorManager);

            return juniorManager;
        }

        @Test
        public void Test() {

            Specification spoiledSpecification = new Specification();

            int spoiledKilogram = spoiledSpecification.getSpoiledChocolateCount();

            spoiledKilogram = 1765; //通过这里设置spoiled数量，经过验证，输出逻辑正确

            System.out.println("           " +"请求处理仓库中的变质巧克力：");
            ResponsibleHandler responsibleChain = getChainOfManagers(spoiledKilogram);
            responsibleChain.handle();
            System.out.println("           " + UI.designPattern("责任链模式"));
        }


        public void handle() {

            Specification spoiledSpecification = new Specification();

            int spoiledKilogram = spoiledSpecification.getSpoiledChocolateCount();
            System.out.println("           " +"请求处理仓库中的变质巧克力：");
            ResponsibleHandler responsibleChain = getChainOfManagers(spoiledKilogram);
            responsibleChain.handle();
            System.out.println("           " + UI.designPattern("责任链模式"));
        }

}

