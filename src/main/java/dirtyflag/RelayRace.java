package dirtyflag;

import java.util.ArrayList;

/**
 * 接力比赛类
 */
public class RelayRace {
    //    比赛队伍列表
    ArrayList<RelayRaceTeam> RelayRaceTeams;

    /**
     * 构造函数
     *
     * @param RelayRaceTeams 比赛队伍ArrayList
     */
    public RelayRace(ArrayList<RelayRaceTeam> RelayRaceTeams) {
        this.RelayRaceTeams = RelayRaceTeams;
    }

    /**
     * 开始接力比赛
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {
//        每一对都起跑
        for (int i = 0; i < RelayRaceTeams.size(); i++) {
            RelayRaceTeams.get(i).run();
        }
        boolean finished = false;
        while (!finished) {
            finished = true;
            String race = "";
            for (int i = 0; i < RelayRaceTeams.size(); i++) {
                race = race + RelayRaceTeams.get(i).getLocation() + "||";
                if (!RelayRaceTeams.get(i).finished) {
                    finished = false;
                }
            }
            System.out.println(race);
            Thread.sleep(300);
        }
        for (int i = 0; i < RelayRaceTeams.size(); i++) {
            System.out.println(RelayRaceTeams.get(i).stop());
        }
        double minTime = RelayRaceTeams.get(0).getUsingTime();
        int win = 0;
        for (int i = 1; i < RelayRaceTeams.size(); i++) {
            if (RelayRaceTeams.get(i).getUsingTime() < minTime) {
                minTime = RelayRaceTeams.get(i).getUsingTime();
                win = i;
            }
        }
        System.out.println("胜利队伍是：" + RelayRaceTeams.get(win).getTeamName());
    }

}
