package cn.edu.tongji.team.test;

import cn.edu.tongji.team.model.beans.grade.Apprentice;
import cn.edu.tongji.team.model.beans.grade.Grade;
import cn.edu.tongji.team.model.beans.grade.Journeyman;
import cn.edu.tongji.team.model.beans.grade.Junior;
import cn.edu.tongji.team.model.beans.worker.Engineer;
import cn.edu.tongji.team.model.beans.worker.Manager;
import cn.edu.tongji.team.model.beans.worker.ProductionWorker;
import cn.edu.tongji.team.model.beans.worker.Worker;
import cn.edu.tongji.team.patterns.visitor.AbstractVisitor;
import cn.edu.tongji.team.patterns.visitor.FAVisitor;
import cn.edu.tongji.team.patterns.visitor.HRVisitor;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class VisitorTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        FAVisitor faVisitor=new FAVisitor();   //财务部门
        HRVisitor hrVisitor=new HRVisitor();   //人事部门
        //添加三个员工并设定工时和时薪
        ProductionWorker worker1= new ProductionWorker("小明");
        worker1.setWorkHour(40);
        worker1.setHourlyWage(100);
        Engineer worker2 = new Engineer("小红");
        worker2.setWorkHour(35);
        worker2.setHourlyWage(200);
        Manager worker3 = new Manager("小叶");
        worker3.setWorkHour(30);
        worker3.setHourlyWage(300);
        Manager worker4 = new Manager("小马");
        worker3.setWorkHour(30);
        worker3.setHourlyWage(300);


        List<Grade> gradeList = new ArrayList<>();
        gradeList.add(new Apprentice(worker1));
        gradeList.add(new Journeyman(worker2));
        gradeList.add(new Journeyman(worker3));
        gradeList.add(new Junior(worker4));

        Class clazz = Grade.class;
        for (Grade grade : gradeList) {
            Field field = clazz.getDeclaredField("worker");
            field.setAccessible(true);
            faVisitor.visit((Worker)field.get(grade));
            grade.accept(faVisitor);    //财务部对员工的访问
            grade.accept(hrVisitor);    //人事部门对员工的访问
            System.out.println("--------------------------------------");
        }
    }
}
