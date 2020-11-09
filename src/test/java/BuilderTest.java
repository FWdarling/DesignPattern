import Builder.FlyingVenueBuilder;
import Builder.RacingTrackBuilder;
import Builder.StadiumBuilder;
import Builder.StadiumConstractor;
import org.junit.Test;

public class BuilderTest {
    @Test
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
}
