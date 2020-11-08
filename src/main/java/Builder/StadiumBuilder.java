package Builder;

import java.util.Map;

abstract class StadiumBuilder {

    protected Stadium stadium;

    public Stadium getStadium() {
        stadium.showStadium();
        return stadium;
    }

    public void buildNewStadium() {
        stadium = new Stadium();
    }

    public abstract void buildSpectatorArea();

    public abstract void buildCompetitionArea();

    public abstract void setStadiumType();
}
