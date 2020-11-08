package Builder;

public class StadiumConstractor {
    private StadiumBuilder stadiumBuilder;

    public void setStadiumBuilder(StadiumBuilder stadiumBuilder) {
        this.stadiumBuilder = stadiumBuilder;
    }

    public Stadium getStadium() {
        return stadiumBuilder.getStadium();
    }

    public void constructStadium() {
        stadiumBuilder.buildNewStadium();
        stadiumBuilder.setStadiumType();
        stadiumBuilder.buildCompetitionArea();
        stadiumBuilder.buildSpectatorArea();
    }
}
