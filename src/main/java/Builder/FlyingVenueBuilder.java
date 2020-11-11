package Builder;

/**
 * 飞行类场馆建造类，继承自场馆建造类
 */
public class FlyingVenueBuilder extends StadiumBuilder{
    @Override
    public void buildSpectatorArea() {
        stadium.setSpectatorArea(6,150);
    }

    @Override
    public void buildCompetitionArea() {
        stadium.setCompetitionArea(6,200,"flight area");
    }

    @Override
    public void setStadiumType() {
        stadium.setStadiumType("flying venue");
    }
}
