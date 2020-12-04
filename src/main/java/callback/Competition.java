package callback;

import entity.ScoreBoard;

import java.util.Random;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:33 2020/11/13
 * @Modified By:
 **/
public class Competition extends Task {
    private ScoreBoard scoreBoard;

    /**
     Constructor of the Competition.

     Args:
        ScoreBoard scoreBoard: An object to record the competition results.

     Return:
     */
    public Competition(ScoreBoard scoreBoard){
        this.scoreBoard = scoreBoard;
    }

    /**
     exec is an abstract function to be defined by users, in the callback design patterns. The process is mainly devides into
     2 parts, first part is to finish a defined action which is implemented in exec. After finishing the exec function, then
     the callback procedure will be called, and conduct the callback actions.

     Args:

     Return Value:

     Example:
     >> exec();
     >> callback();
     **/
    @Override
    public void exec(){
        Random random=new Random();

        int team1No=random.nextInt(5);
        String team1=scoreBoard.getTeamName(team1No);
        System.out.println("参赛队伍1："+team1+"\n");

        int team2No=random.nextInt(5);
        while(team2No==team1No){
            team2No=random.nextInt(5);
        }
        String team2=scoreBoard.getTeamName(team2No);
        System.out.println("参赛队伍2："+team2+"\n");

        int winnerNo=random.nextInt(2);
        String winner;
        String loser;
        if(winnerNo==1){
            winner=team1;
            loser=team2;
        }
        else{
            winner=team2;
            loser=team1;
        }
        System.out.println("比赛胜者是："+winner+"\n");
        System.out.println("                                        " +
                "[ ScoreBoard : updateScoreBoard() : 更新比分板 ]");
        scoreBoard.updateScoreBoard(winner,loser);
    }
}
