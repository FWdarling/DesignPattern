package test.java.factorymethod;

import main.java.factorymethod.FactoryMethodDemo;
import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodDemoTest {

    @org.junit.jupiter.api.Test
    void runFactoryMethodDemo() {
        System.out.println("========  测试工厂方法开始  ========");
        FactoryMethodDemo.runFactoryMethodDemo();
        System.out.println("========  测试工厂方法结束  ========");
    }
}