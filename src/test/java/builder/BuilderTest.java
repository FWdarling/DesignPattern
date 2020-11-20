package builder;

import entity.Stadium;
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
        StadiumDirector stadiumDirector = new StadiumDirector();
        StadiumBuilder racingTrackBuilder = new RacingTrackBuilder();
        StadiumBuilder flyingVenueBuilder = new FlyingVenueBuilder();
        StadiumBuilder swimmingPoolBuilder = new SwimmingPoolBuilder();
        stadiumDirector.setStadiumBuilder(racingTrackBuilder);
        stadiumDirector.constructStadium();

        stadiumDirector.setStadiumBuilder(flyingVenueBuilder);
        stadiumDirector.constructStadium();

        stadiumDirector.setStadiumBuilder(swimmingPoolBuilder);
        stadiumDirector.CompetitionAreaCount(20).SpectatorAreaCount(12).constructStadium();
    }
}
