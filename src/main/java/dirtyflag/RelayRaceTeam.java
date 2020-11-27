package dirtyflag;

import java.util.ArrayList;

/**
 * 接力比赛队伍
 */
public class RelayRaceTeam {
    //    运动员
    ArrayList<RelayRaceAthlete> RelayRaceAthletes;
    // 比赛开始时间
    long startTime;
    // 最后一次check
    long lastCheckTime;
    // 是否结束
    boolean finished = false;

    /**
     * 获取该队伍用时
     *
     * @return 赛跑时长
     */
    public double getUsingTime() {
        return usingTime;
    }

    // 使用时间
    double usingTime = 0;

    /**
     * 获取队伍名称
     *
     * @return 队伍名
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 设置队伍名称
     *
     * @param teamName 队伍名称
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    //    队伍名称
    String teamName;

    /**
     * 构造函数
     *
     * @param teamName 队伍名称
     * @param name1    第一棒选手名
     * @param name2    第二棒选手名
     * @param name3    第三棒选手名
     * @param speed1   第一棒选手速度m/s
     * @param speed2   第二棒选手速度m/s
     * @param speed3   第三棒选手速度m/s
     */
    public RelayRaceTeam(String teamName, String name1, String name2, String name3,
                         double speed1, double speed2, double speed3) {
        this.teamName = teamName;
        this.RelayRaceAthletes = new ArrayList<>();
        this.RelayRaceAthletes.add(new RelayRaceAthlete(name1, speed1, 0));
        this.RelayRaceAthletes.add(new RelayRaceAthlete(name2, speed2, 1));
        this.RelayRaceAthletes.add(new RelayRaceAthlete(name3, speed3, 2));
    }

    /**
     * 开始赛跑运算
     */
    public void run() {
        this.usingTime = 0;
        this.startTime = System.currentTimeMillis();
        this.RelayRaceAthletes.get(0).setMoving(true);
        this.lastCheckTime = startTime;
        this.finished = false;
    }

    /**
     * 停止比赛
     *
     * @return 返回用时字符串
     */
    public String stop() {
        this.finished = false;
        for (int i = 0; i < 3; i++) {
            this.RelayRaceAthletes.get(i).setMoving(false);
            this.RelayRaceAthletes.get(i).setDistance(100 * i);
        }
        return getTeamName() + "用时" + String.valueOf(this.usingTime / 1000) + "秒";
    }

    /**
     * 获取每一时间片的位置信息
     *
     * @return 返回该队伍成员位置字符串
     */
    public String getLocation() {
        ArrayList<Double> locations = new ArrayList<>();

        this.finished = true;
        for (int i = 0; i < 3; i++) {
            if (!this.RelayRaceAthletes.get(i).isMoving()) {
                locations.add(this.RelayRaceAthletes.get(i).distance);
            } else {
                this.finished = false;
                double movedDistance = (System.currentTimeMillis() - this.lastCheckTime) / 1000f *
                        this.RelayRaceAthletes.get(i).getSpeed();
                double location = this.RelayRaceAthletes.get(i).getDistance();
                locations.add(location);
                this.RelayRaceAthletes.get(i).setDistance(location + movedDistance);
                // 到达交接处
                if (location + movedDistance >= 100 * (i + 1)) {
                    this.RelayRaceAthletes.get(i).setMoving(false);
                    if (i < 2) {
                        this.RelayRaceAthletes.get(i + 1).setMoving(true);
                    }
                }
            }
        }
        if (!this.finished) {
            this.usingTime = this.usingTime + System.currentTimeMillis() - this.lastCheckTime;
        }
        this.lastCheckTime = System.currentTimeMillis();
        return this.getTeamName() + "：" + this.RelayRaceAthletes.get(0).getName() + "：" +
                String.format("%.2f", locations.get(0)) + "m，" +
                this.RelayRaceAthletes.get(1).getName() + "：" +
                String.format("%.2f", locations.get(1)) + "m，" +
                this.RelayRaceAthletes.get(2).getName() + "：" +
                String.format("%.2f", locations.get(2)) + "m";
    }

}
