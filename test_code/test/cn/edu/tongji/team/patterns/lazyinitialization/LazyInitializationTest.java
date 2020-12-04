package cn.edu.tongji.team.patterns.lazyinitialization;

import cn.edu.tongji.team.patterns.factory.ChocoFactoryProducer;
import cn.edu.tongji.team.patterns.factory.FactoryType;
import org.junit.Test;


/**
 * description: LazyInitializationTest
 * date: 12/4
 * author: Li
 */

public class LazyInitializationTest {
    @Test
    public void LazyInitializationTest()
    {
        //懒加载模式
        System.out.println("-----懒加载模式-----");
        System.out.println("创建德芙巧克力工厂");
        ChocoFactoryProducer.getFactory(FactoryType.DoveFactory);
        System.out.println("当前创建的工厂数为"+ChocoFactoryProducer.getMapSize());
        System.out.println("创建费列罗巧克力工厂");
        ChocoFactoryProducer.getFactory(FactoryType.FerreroFactory);
        System.out.println("当前创建的工厂数为"+ChocoFactoryProducer.getMapSize());
        System.out.println("创建好时巧克力工厂");
        ChocoFactoryProducer.getFactory(FactoryType.HersheyFactory);
        System.out.println("当前创建的工厂数为"+ChocoFactoryProducer.getMapSize());
        System.out.println("创建德芙巧克力工厂");
        //重新创建德芙巧克力工厂则不会再增加
        ChocoFactoryProducer.getFactory(FactoryType.DoveFactory);
        System.out.println("当前创建的工厂数为"+ChocoFactoryProducer.getMapSize());
        System.out.println("------------------");
    }
}
