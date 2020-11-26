package builder;

import entity.Stadium;

/**
 * 执行建设场馆的指挥类
 */
public class StadiumDirector {
    //    场馆建造抽象类
    private StadiumBuilder stadiumBuilder;

//    观众席数量
private int spectatorAreaCount = 0;

    //    竞赛区数量
    private int competitionAreaCount = 0;

    /**
     * 设定当前场馆建造类
     *
     * @param stadiumBuilder 场馆建造实例
     */
    public void setStadiumBuilder(StadiumBuilder stadiumBuilder) {
        this.stadiumBuilder = stadiumBuilder;
    }

    /**
     * 打印当前建造的场馆信息
     */
    public void getStadium() {
        stadiumBuilder.getStadium();
    }

    /**
     * 设置比赛区数量
     *
     * @param count int自定义比赛区数量，不小于2
     * @return this
     */
    public StadiumDirector CompetitionAreaCount(int count) {
        this.competitionAreaCount = count;
        return this;
    }

    /**
     * 设置观众席数量
     *
     * @param count int自定义观众席数量，大于零
     * @return this
     */
    public StadiumDirector SpectatorAreaCount(int count) {
        this.spectatorAreaCount = count;
        return this;
    }

    /**
     * 建造场馆并打印场馆信息
     */
    public void constructStadium() {
        try {
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
        } catch (Exception e) {
            System.out.println("已捕获到异常错误：" + e.getMessage());
        }
    }
}
