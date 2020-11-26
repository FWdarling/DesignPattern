package entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 所有场馆类的父类
 */
public class Stadium {
//    场馆类型
    private String stadiumType;

//    观众席
    private final Map<String, Integer> spectatorArea = new HashMap<>();

//    竞赛区
    private final Map<String, Integer> competitionArea = new HashMap<>();

//    竞赛区类型
    private String competitionAreaType;

    /**
     * 设置观众区
     * @param sz  观众区大小
     */
    public void setSpectatorArea(int cnt, int sz) {
        this.spectatorArea.put("count", cnt);
        this.spectatorArea.put("size", sz);
    }

    /**
     * 设置竞赛区
     * @param sz 竞赛区大小
     * @param tp 竞赛区类型
     */
    public void setCompetitionArea(int cnt, int sz, String tp) {
        this.competitionArea.put("count", cnt);
        this.competitionArea.put("size", sz);
        this.competitionAreaType = tp;
    }

    /**
     * 设置场馆类型
     * @param type 场馆类型
     */
    public void setStadiumType(String type) {
        this.stadiumType = type;
    }

    /**
     * 打印出场馆信息
     */
    public void showStadium() {
        System.out.println("建造了场馆：" + this.stadiumType);
        System.out.println("——该场馆有" + this.competitionArea.get("count") + "个" +
                this.competitionAreaType + "，每个" +
                this.competitionArea.get("size") + "平方米");
        System.out.println("——该场馆有" + this.spectatorArea.get("count") +
                "个观众席，每个" +
                this.spectatorArea.get("size") + "平方米");
        System.out.println("===================");
    }
}
