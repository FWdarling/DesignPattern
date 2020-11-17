package main.java.abstractfactory;

import main.java.abstractfactory.myapp.JumpingScorer;

/**
 * 抽象工厂模式 Demo 类
 */
public class AbstractFactoryDemo {
    /**
     * 运行抽象工厂 Demo
     * 1. 首先创建跳远计分员
     * 2. 记分员按项目性别创建 3 个成绩单，并保存下来
     * 3. 打印成绩
     */
    public static void runAbstractFactoryDemo(){
        JumpingScorer jumpingScorer = new JumpingScorer();

        jumpingScorer.addResult(jumpingScorer.createFemaleResult("Abby"));
        jumpingScorer.addResult(jumpingScorer.createMaleResult("Bob"));
        jumpingScorer.addResult(jumpingScorer.createFemaleResult("Cindy"));

        jumpingScorer.showResults();
    }
}
