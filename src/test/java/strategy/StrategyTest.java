package strategy;

import org.junit.Test;

/**
 * Strategy测试类
 */
public class StrategyTest {
    @Test
    public void StrategyTest() {
        System.out.println("---------------- [Pattern] Strategy ----------------");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        Bird bird = new Bird();
        bird.eat();
        Fish fish = new Fish();
        fish.eat();
        rabbit.train();
        bird.train();
        fish.train();
        System.out.println("------------------------ END ------------------------");
    }
}
