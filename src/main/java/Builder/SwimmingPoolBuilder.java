package Builder;

public class SwimmingPoolBuilder extends StadiumBuilder {
    @Override
    public void buildSpectatorArea() {
        stadium.setSpectatorArea(8, 100);
    }

    @Override
    public void buildCompetitionArea() {
        stadium.setCompetitionArea(12, 50, "swimming track");
    }

    @Override
    public Stadium getStadium() {
        return super.getStadium();
    }

    @Override
    public void setStadiumType() {
        stadium.setStadiumType("swimming pool");
    }
}
