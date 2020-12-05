package cn.edu.tongji.team.test.factory;

import cn.edu.tongji.team.model.beans.chocolate.Chocolate;
import cn.edu.tongji.team.model.beans.chocolate.ChocolateType;
import cn.edu.tongji.team.patterns.factory.chocofactory.DoveFactory;
import cn.edu.tongji.team.patterns.factory.chocofactory.FerreroFactory;
import cn.edu.tongji.team.patterns.factory.chocofactory.HersheyFactory;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void FactoryTest() {
// 创建一个工厂
        DoveFactory doveFactory = new DoveFactory();
        // 制造对象
        Chocolate dove = doveFactory.createChoco(ChocolateType.Ordinary);
        dove.box(); // 打包

        System.out.println("-------------------------");

        // 创建一个工厂
        FerreroFactory ferreroFactory = new FerreroFactory();
        // 制造对象
        Chocolate ferrero = ferreroFactory.createChoco(ChocolateType.Premium);
        ferrero.box(); // 打包
    }
}
