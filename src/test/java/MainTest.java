import Strategy.Bird;
import Strategy.Fish;
import Strategy.Rabbit;
import org.junit.Test;
import Builder.*;

public class MainTest {
//    @Test
    public void builderTest() {
        System.out.println("--------------------");
        System.out.println("This is Builder Test");
        System.out.println("--------------------");
        StadiumConstractor stadiumConstractor = new StadiumConstractor();
        StadiumBuilder racingTrackBuilder = new RacingTrackBuilder();
        StadiumBuilder flyingVenueBuilder = new FlyingVenueBuilder();
        stadiumConstractor.setStadiumBuilder(racingTrackBuilder);
        stadiumConstractor.constructStadium();
        stadiumConstractor.getStadium();

        stadiumConstractor.setStadiumBuilder(flyingVenueBuilder);
        stadiumConstractor.constructStadium();
        stadiumConstractor.getStadium();
    }

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
