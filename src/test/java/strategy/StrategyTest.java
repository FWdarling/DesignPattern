package strategy;

import org.junit.Test;

/**
 * Strategy测试类
 */
public class StrategyTest {
    @Test
    public void StrategyTest() {
        System.out.println("---------------- [Pattern] Strategy ----------------");
//        创建动物并进行进食、训练以及表演
        Rabbit rabbit = new Rabbit("兔斯基", "跑步");
        rabbit.eat();
        Bird bird = new Bird("愤怒的小鸟", "竞速飞行");
        bird.eat();
        Fish fish = new Fish("小丑鱼", "花样游泳");
        fish.eat();
        rabbit.train();
        bird.train();
        fish.train();
        bird.perform();
        fish.perform();
        rabbit.perform();
        System.out.println("------------------------ END ------------------------");
    }
}
