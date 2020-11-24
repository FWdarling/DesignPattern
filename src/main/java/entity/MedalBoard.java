package entity;

import java.util.HashMap;
import java.util.Map;

/**
 * description: 奖牌榜类,用于记录奖牌榜上各个动物获得奖牌的数目及排名等信息
 * date: 11/23/20 14:15 PM
 * author: cjsmt
 */
public class MedalBoard {
    private int gold[] = new int[5];
    private int silver[] = new int[5];
    private int bronze[] = new int [5];
    private String teamName[] = new String[5];
    private Map<String,Integer> team = new HashMap<String, Integer>();
    private int rank[] = new int[5];

    public MedalBoard(){
        team.put("Dog ",0);
        team.put("Chicken",1);
        team.put("Bird",2);
        team.put("Bear",3);
        team.put("Fish",4);

        teamName[0] = "Dog ";
        teamName[1] = "Chicken";
        teamName[2] = "Bird";
        teamName[3] = "Bear";
        teamName[4] = "Fish";

        for (int i = 0; i < 5; i++){
            rank[i] = i;
        }
    }

    public void updateMedalBoard(String winner, Material material){
        int winnerNo=team.get(winner);
        switch (material){
            case Gold:
                gold[winnerNo] += 1;
                break;
            case Silver:
                silver[winnerNo] += 1;
                break;
            case Bronze:
                bronze[winnerNo] += 1;
                break;
        }
    }

    public String getTeamName(int teamNo){
        return teamName[teamNo];
    }

    public int getTeamGold(int teamNo){
        return gold[teamNo];
    }

    public int getTeamSilver(int teamNo){
        return silver[teamNo];
    }

    public int getTeamBronze(int teamNo){
        return bronze[teamNo];
    }

    public int getRankTeam(int rankNo){
        return rank[rankNo];
    }

    public void swagRankTeam(int rankNo1, int rankNo2){
        int temp = rank[rankNo1];
        rank[rankNo1] = rank[rankNo2];
        rank[rankNo2] = temp;
    }

    public int[] getRank(){
        return rank;
    }

    public void showRank(){
        for(int i = 1; i <= 5; i++){
            int teamNo = getRankTeam(i-1);
            System.out.println(i + "\t" + getTeamName(teamNo) + "\tGold:" + getTeamGold(teamNo)
                    + "\tSilver:" + getTeamSilver(teamNo) + "\tBronze:" + getTeamBronze(teamNo));
        }
        System.out.println("\t");
    }


}
