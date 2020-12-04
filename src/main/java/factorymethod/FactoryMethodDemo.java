package factorymethod;

import factorymethod.myapp.RaceScorer;
import factorymethod.myapp.ShootingScorer;

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

        System.out.println("                                        [ RaceScorer : addResult(String name) : 赛跑记分员创建并添加运动员的成绩单 ]");

        raceScorer.addResult("Abby");
        raceScorer.addResult("Bob");
        raceScorer.addResult("Cindy");

        System.out.println("                                        [ ShootingScorer : addResult(String name) : 射击记分员创建并添加运动员的成绩单 ]");

        ShootingScorer shootingScorer = new ShootingScorer();
        shootingScorer.addResult("Abby");
        shootingScorer.addResult("Bob");
        shootingScorer.addResult("Cindy");

        raceScorer.showResults();
        shootingScorer.showResults();
    }
}
