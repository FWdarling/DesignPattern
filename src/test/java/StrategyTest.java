import Strategy.entity.Bird;
import Strategy.entity.Fish;
import Strategy.entity.Rabbit;
import org.junit.Test;

/**
 * Strategy测试类
 */
public class StrategyTest {
    @Test
    public void StrategyTest() {
        System.out.println("---------------------");
        System.out.println("This is Strategy Test");
        System.out.println("---------------------");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        Bird bird = new Bird();
        bird.eat();
        Fish fish = new Fish();
        fish.eat();
        rabbit.train();
        bird.train();
        fish.train();
    }
}
