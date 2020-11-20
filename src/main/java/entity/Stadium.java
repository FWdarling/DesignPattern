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
     * @param cnt 观众区数量
     * @param sz  观众区大小
     */
    public void setSpectatorArea(int cnt, int sz) {
        this.spectatorArea.put("count", cnt);
        this.spectatorArea.put("size", sz);
    }

    /**
     * 设置竞赛区
     * @param cnt 竞赛区数量
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
        System.out.println("Built a " + this.stadiumType + " with:");
        System.out.println(this.competitionArea.get("count") + " " +
                this.competitionAreaType + "s, each of " +
                this.competitionArea.get("size") + " acres");
        System.out.println(this.spectatorArea.get("count") +
                " spectator areas of " +
                this.spectatorArea.get("size") + " acres");
        System.out.println("===================");
    }
}
