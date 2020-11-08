package Builder;

public abstract class StadiumBuilder {

    protected Stadium stadium;

    public void getStadium() {
        stadium.showStadium();
    }

    public void buildNewStadium() {
        stadium = new Stadium();
    }

    public abstract void buildSpectatorArea();

    public abstract void buildCompetitionArea();

    public abstract void setStadiumType();
}
