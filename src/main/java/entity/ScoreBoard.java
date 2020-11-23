package entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:55 2020/11/13
 * @Modified By:
 **/
public class ScoreBoard {
    private int win[] = new int[5];
    private int lose[] = new int[5];
    private int score[] = new int[5];
    private String teamName[] = new String[5];
    private Map<String,Integer> team = new HashMap<String, Integer>();
    private int teamSum=5;

    public ScoreBoard(){
        team.put("Dog",0);
        team.put("Chicken",1);
        team.put("Bird",2);
        team.put("Bear",3);
        team.put("Fish",4);

        teamName[0] = "Dog";
        teamName[1] = "Chicken";
        teamName[2] = "Bird";
        teamName[3] = "Bear";
        teamName[4] = "Fish";
    }

    public void updateScoreBoard(String winner,String loser){
        int winnerNo=team.get(winner);
        int loserNo=team.get(loser);
        win[winnerNo]+=1;
        lose[loserNo]+=1;
        score[winnerNo]+=3;
        score[loserNo]+=1;
    }

    public String getTeamName(int teamNo){
        return teamName[teamNo];
    }

    public int getTeamWin(int teamNo){
        return win[teamNo];
    }

    public int getTeamLost(int teamNo){
        return lose[teamNo];
    }

    public int getTeamScore(int teamNo){
        return score[teamNo];
    }

    public int getTeamSum(){
        return teamSum;
    }
}
