package test.java.nullobject;

import main.java.nullobject.NullObjectDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nullObjectDemoTest {

    @Test
    void runNullObjectDemo() {
        System.out.println("========  测试空对象模式开始  ========");
        NullObjectDemo.runNullObjectDemo();
        System.out.println("========  测试空对象模式结束  ========");
    }
}