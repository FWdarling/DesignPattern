package cn.edu.tongji.team.test.flyweight;

import cn.edu.tongji.team.model.beans.chocolate.Chocolate;
import cn.edu.tongji.team.model.beans.chocolate.ChocolateType;
import cn.edu.tongji.team.patterns.factory.ChocoFactoryProducer;
import cn.edu.tongji.team.patterns.factory.FactoryType;
import cn.edu.tongji.team.patterns.factory.chocofactory.AbstractChocoFactory;
import org.junit.Test;

public class FlyweightTest {
    @Test
    public void FlyweightTest() {
// 获得工厂
        AbstractChocoFactory factory = ChocoFactoryProducer.getFactory(FactoryType.DoveFactory);
        Chocolate choco1 = factory.createChoco(ChocolateType.Ordinary);
        System.out.println(choco1 + ", hashcode: " + choco1.hashCode());
        Chocolate choco2 = factory.createChoco(ChocolateType.Deluxe);
        System.out.println(choco2 + ", hashcode: " + choco2.hashCode());
        Chocolate choco3 = factory.createChoco(ChocolateType.Deluxe);
        System.out.println(choco3 + ", hashcode: " + choco3.hashCode());
    }
}
