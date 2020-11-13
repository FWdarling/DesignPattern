package builder;

import builder.FlyingVenueBuilder;
import builder.RacingTrackBuilder;
import builder.StadiumBuilder;
import builder.StadiumConstractor;
import org.junit.Test;

/**
 * Builder测试类
 */
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
