import Multiton.RoomDistributor;
import Multiton.TrainingRoom;
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

//    @Test
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

    @Test
    public void MultitonTest(){
        System.out.println("---------------------");
        System.out.println("This is Multiton Test");
        System.out.println("---------------------");
        RoomDistributor roomDistributor = new RoomDistributor();
        TrainingRoom trainingRoom1 = roomDistributor.applyRoom();
        TrainingRoom trainingRoom2 = roomDistributor.applyRoom();
        TrainingRoom trainingRoom3 = roomDistributor.applyRoom();
        TrainingRoom trainingRoom4 = roomDistributor.applyRoom();
        trainingRoom1.showRoom();
        trainingRoom2.showRoom();
        trainingRoom3.showRoom();
        trainingRoom2.repayRoom();
        trainingRoom4 = roomDistributor.applyRoom();
        trainingRoom4.showRoom();
    }

}
