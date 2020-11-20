package builder;

/**
 * 飞行类场馆建造类，继承自场馆建造类
 */
public class FlyingVenueBuilder extends StadiumBuilder{

    @Override
    public void buildSpectatorArea() {
        stadium.setSpectatorArea(12, 150);
    }

    @Override
    public void buildCompetitionArea() {
        stadium.setCompetitionArea(12, 300, "飞行区");
    }

    @Override
    public void buildSpectatorArea(int count) {
        stadium.setSpectatorArea(count, 150);
    }

    @Override
    public void buildCompetitionArea(int count) {
        stadium.setCompetitionArea(count, 300, "飞行区");
    }

    @Override
    public void setStadiumType() {
        stadium.setStadiumType("飞行赛场");
    }
}
