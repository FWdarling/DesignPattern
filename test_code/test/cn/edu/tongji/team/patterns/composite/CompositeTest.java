package cn.edu.tongji.team.patterns.abstractfactory;

import cn.edu.tongji.team.patterns.factory.ChocoFactoryProducer;
import cn.edu.tongji.team.patterns.factory.FactoryType;
import cn.edu.tongji.team.patterns.factory.chocofactory.*;
import cn.edu.tongji.team.model.beans.chocolate.*;

public class AbstractFactory {
    public static void main(String[] args) {
        // 获得具体的实现类工厂对象
        FerreroFactory ferreroFactory = (FerreroFactory)ChocoFactoryProducer.getFactory(FactoryType.FerreroFactory);
        HersheyFactory hersheyFactory = (HersheyFactory)ChocoFactoryProducer.getFactory(FactoryType.HersheyFactory);
        DoveFactory doveFactory = (DoveFactory)ChocoFactoryProducer.getFactory(FactoryType.DoveFactory);

        // 创建巧克力对象
        System.out.println("-----------------------------");
        Chocolate choco1 = ferreroFactory.createChoco(ChocolateType.Ordinary);
        System.out.println("-----------------------------");
        Chocolate choco2 = ferreroFactory.createChoco(ChocolateType.Premium);
        System.out.println("-----------------------------");
        Chocolate choco3 = hersheyFactory.createChoco(ChocolateType.Deluxe);
        System.out.println("-----------------------------");
        Chocolate choco4 = doveFactory.createChoco(ChocolateType.Premium);

    }
}