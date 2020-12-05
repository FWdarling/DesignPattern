package cn.edu.tongji.team.patterns.abstractfactory;

//import static org.junit.jupiter.api.Assertions.*;

import cn.edu.tongji.team.model.beans.chocolate.Chocolate;
import cn.edu.tongji.team.model.beans.chocolate.ChocolateType;
import cn.edu.tongji.team.patterns.factory.ChocoFactoryProducer;
import cn.edu.tongji.team.patterns.factory.FactoryType;
import cn.edu.tongji.team.patterns.factory.chocofactory.DoveFactory;
import cn.edu.tongji.team.patterns.factory.chocofactory.FerreroFactory;
import cn.edu.tongji.team.patterns.factory.chocofactory.HersheyFactory;
import org.junit.Test;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/12/3,21:00
 * Version: 1.0
 */
public class AbstractFactoryTest {
    @Test
    public void Test(){
        FerreroFactory ferreroFactory = (FerreroFactory) ChocoFactoryProducer.getFactory(FactoryType.FerreroFactory);
        HersheyFactory hersheyFactory = (HersheyFactory)ChocoFactoryProducer.getFactory(FactoryType.HersheyFactory);
        DoveFactory doveFactory = (DoveFactory)ChocoFactoryProducer.getFactory(FactoryType.DoveFactory);

        System.out.println("-----------------------------");
        Chocolate choco1 = ferreroFactory.createChoco(ChocolateType.Ordinary);
        System.out.println("-----------------------------");
        Chocolate choco2 = ferreroFactory.createChoco(ChocolateType.Premium);
        System.out.println("-----------------------------");
        Chocolate choco3 = hersheyFactory.createChoco(ChocolateType.Deluxe);
        System.out.println("-----------------------------");
        Chocolate choco4 = doveFactory.createChoco(ChocolateType.Premium);
        System.out.println("-----------------------------");
        Chocolate choco5 = ferreroFactory.createChoco(ChocolateType.Deluxe);
        System.out.println("-----------------------------");
        Chocolate choco6 = hersheyFactory.createChoco(ChocolateType.Deluxe);


    }
}