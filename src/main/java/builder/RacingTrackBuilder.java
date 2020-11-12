package builder;

/**
 * 跑步类场馆建造类，继承自场馆建造类
 */
public class RacingTrackBuilder extends StadiumBuilder {
    @Override
    public void buildSpectatorArea() {
        stadium.setSpectatorArea(3, 200);
    }

    @Override
    public void buildCompetitionArea() {
        stadium.setCompetitionArea(8, 600, "racing track");
    }

    @Override
    public void setStadiumType() {
        stadium.setStadiumType("racing pitch");
    }
}
