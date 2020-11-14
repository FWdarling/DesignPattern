package test.java.state;

import main.java.state.StateDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateDemoTest {

    @Test
    void runStateDemo() {
        System.out.println("========  测试状态模式开始  ========");
        StateDemo.runStateDemo();
        System.out.println("========  测试状态模式结束  ========");
    }
}