package cn.edu.tongji.team.patterns.dependencyinjection;

/**
 * description: DependencyInjectionTest
 * date: 12/4
 * author: Li
 */

import cn.edu.tongji.team.patterns.strategy.BeijingStrategy;
import cn.edu.tongji.team.patterns.strategy.CityStartegyContext;
import cn.edu.tongji.team.patterns.strategy.DoveFactoryStrategy;
import cn.edu.tongji.team.patterns.strategy.StartegyContext;
import cn.edu.tongji.team.model.beans.chocolate.ChocolateType;
import org.junit.Test;

/**
 * 依赖注入
 */
public class DependencyInjectionTest {
    @Test
    public void DependencyInjectionTest()
    {
        System.out.println("依赖注入：将类注入到要调用的类当中去......");
        //调用建立巧克力工厂的策略模式
        StartegyContext depencyInjectionContext=new StartegyContext();
        depencyInjectionContext.setStrategy(new DoveFactoryStrategy());
        depencyInjectionContext.executeStrategy(ChocolateType.Deluxe);
        //调用选择厂址的策略模式
        CityStartegyContext depencyContext=new CityStartegyContext();
        depencyContext.setStrategy(new BeijingStrategy());
        depencyContext.executeStrategy();
        System.out.println("通过依赖注入的方式，将服务注入到类中，这里采用方法注入......");
    }
}
