package builder;

/**
 * 游泳比赛场馆建造类
 */
public class SwimmingPoolBuilder extends StadiumBuilder {

    @Override
    public void buildSpectatorArea() {
        stadium.setSpectatorArea(16, 100);
    }

    @Override
    public void buildCompetitionArea() {
        stadium.setCompetitionArea(8, 50, "泳道");
    }

    @Override
    public void buildSpectatorArea(int count) {
        stadium.setSpectatorArea(count, 100);
    }

    @Override
    public void buildCompetitionArea(int count) {
        stadium.setCompetitionArea(count, 50, "泳道");
    }

    @Override
    public void setStadiumType() {
        stadium.setStadiumType("游泳馆");
    }
}
