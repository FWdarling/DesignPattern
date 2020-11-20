package builder;

import entity.Stadium;

/**
 * 执行建设场馆的类
 */
public class StadiumDirector {
    //    场馆建造抽象类
    private StadiumBuilder stadiumBuilder;

    private int spectatorAreaCount = 0;

    private int competitionAreaCount = 0;

    public void setStadiumBuilder(StadiumBuilder stadiumBuilder) {
        this.stadiumBuilder = stadiumBuilder;
    }

    public Stadium getStadium() {
        stadiumBuilder.getStadium();
        return stadiumBuilder.stadium;
    }

    public StadiumDirector CompetitionAreaCount(int count) {
        this.competitionAreaCount = count;
        return this;
    }

    public StadiumDirector SpectatorAreaCount(int count) {
        this.spectatorAreaCount = count;
        return this;
    }

    //建造场馆的过程
    public void constructStadium() {
        stadiumBuilder.buildNewStadium();
        stadiumBuilder.setStadiumType();
        if (this.competitionAreaCount == 0) {
            stadiumBuilder.buildCompetitionArea();
        } else {
            stadiumBuilder.buildCompetitionArea(this.competitionAreaCount);
            this.competitionAreaCount = 0;
        }
        if (this.spectatorAreaCount == 0) {
            stadiumBuilder.buildSpectatorArea();
        } else {
            stadiumBuilder.buildSpectatorArea(this.spectatorAreaCount);
            this.spectatorAreaCount = 0;
        }
        this.getStadium();
    }
}
