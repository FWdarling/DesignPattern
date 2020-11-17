package main.java.factorymethod;

import main.java.factorymethod.myapp.RaceScorer;
import main.java.factorymethod.myapp.ShootingScorer;

/**
 * 工厂方法 Demo 类
 * 拥有一个静态方法，用于运行工厂方法 Demo
 */
public class FactoryMethodDemo {
    /**
     * 运行工厂方法 Demo
     * 1. 首先创建赛跑项目记分员，创建并添加三位运动员的分数
     * 2. 再创建射击项目的记分员，创建并添加三位运动员的分数
     * 3. 最后打印记分员登记的所有成绩
     */
    public static void runFactoryMethodDemo(){
        RaceScorer raceScorer = new RaceScorer();
        raceScorer.addResult("Abby");
        raceScorer.addResult("Bob");
        raceScorer.addResult("Cindy");

        ShootingScorer shootingScorer = new ShootingScorer();
        shootingScorer.addResult("Abby");
        shootingScorer.addResult("Bob");
        shootingScorer.addResult("Cindy");

        raceScorer.showResults();
        shootingScorer.showResults();
    }
}
