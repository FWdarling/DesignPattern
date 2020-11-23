package builder;

import entity.Stadium;
import org.junit.Test;

/**
 * Builder测试类
 */
public class BuilderTest {
    @Test
    public void builderTest() {
        System.out.println("---------------- [Pattern] Builder ----------------");
//        生成指挥者类
        StadiumDirector stadiumDirector = new StadiumDirector();

//        场馆建造者类
        StadiumBuilder racingTrackBuilder = new RacingTrackBuilder();
        StadiumBuilder flyingVenueBuilder = new FlyingVenueBuilder();
        StadiumBuilder swimmingPoolBuilder = new SwimmingPoolBuilder();

//        给指挥者类设定建造者
        stadiumDirector.setStadiumBuilder(racingTrackBuilder);

        stadiumDirector.CompetitionAreaCount(-3).SpectatorAreaCount(14).constructStadium();

        stadiumDirector.setStadiumBuilder(flyingVenueBuilder);
        stadiumDirector.SpectatorAreaCount(-3).constructStadium();

        stadiumDirector.setStadiumBuilder(swimmingPoolBuilder);
        stadiumDirector.CompetitionAreaCount(20).SpectatorAreaCount(12).constructStadium();

        System.out.println("------------------------ END ------------------------");
    }
}
