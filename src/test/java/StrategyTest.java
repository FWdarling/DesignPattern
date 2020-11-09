import Strategy.Bird;
import Strategy.Fish;
import Strategy.Rabbit;
import org.junit.Test;

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
