package builder;

/**
 * 跑步类场馆建造类，继承自场馆建造类
 */
public class RacingTrackBuilder extends StadiumBuilder {

    @Override
    public void buildSpectatorArea(int count) {
        stadium.setSpectatorArea(count, 200);
    }

    @Override
    public void buildCompetitionArea(int count) {
        stadium.setCompetitionArea(count, 200, "跑道");
    }

    @Override
    public void buildSpectatorArea() {
        stadium.setSpectatorArea(16, 200);
    }

    @Override
    public void buildCompetitionArea() {
        stadium.setCompetitionArea(8, 200, "跑道");
    }

    @Override
    public void setStadiumType() {
        stadium.setStadiumType("田径赛场");
    }
}
