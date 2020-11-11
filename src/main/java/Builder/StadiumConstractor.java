package Builder;

/**
 * 执行建设场馆的类
 */
public class StadiumConstractor {
    //    场馆建造抽象类
    private StadiumBuilder stadiumBuilder;

    public void setStadiumBuilder(StadiumBuilder stadiumBuilder) {
        this.stadiumBuilder = stadiumBuilder;
    }

    public void getStadium() {
        stadiumBuilder.getStadium();
    }

    //建造场馆的过程
    public void constructStadium() {
        stadiumBuilder.buildNewStadium();
        stadiumBuilder.setStadiumType();
        stadiumBuilder.buildCompetitionArea();
        stadiumBuilder.buildSpectatorArea();
    }
}
