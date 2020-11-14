package test.java.abstractfactory;

import main.java.abstractfactory.AbstractFactoryDemo;
import main.java.factorymethod.FactoryMethodDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryDemoTest {

    @Test
    void runAbstractFactoryDemo() {
        System.out.println("========  测试抽象工厂开始  ========");
        AbstractFactoryDemo.runAbstractFactoryDemo();
        System.out.println("========  测试抽象工厂结束  ========");
    }
}