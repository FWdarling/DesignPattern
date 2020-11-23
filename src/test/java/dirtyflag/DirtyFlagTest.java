package dirtyflag;

import org.junit.Test;

import java.util.ArrayList;

public class DirtyFlagTest {
    @Test
    public void dirtyFlagTest() throws InterruptedException {
        System.out.println("---------------- [Pattern] DirtyFlag ----------------");
//        设置队伍
        RelayRaceTeam team1 = new RelayRaceTeam("一队", "熊大", "熊二", "小蜗",
                20, 30, -1);
        RelayRaceTeam team2 = new RelayRaceTeam("二队", "熊三", "熊四", "大蜗",
                23, 26, 27);
//        设置队伍列表
        ArrayList<RelayRaceTeam> relayRaceTeams = new ArrayList<>();
        relayRaceTeams.add(team1);
        relayRaceTeams.add(team2);
//        构造比赛类实例
        RelayRace relayRace = new RelayRace(relayRaceTeams);
//        开始比赛
        relayRace.start();
        System.out.println("------------------------ END ------------------------");
    }
}
