package callback;

import entity.ScoreBoard;

import java.util.Scanner;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:33 2020/11/13
 * @Modified By:
 **/
public class InputCompetitionResult extends Task {
    private ScoreBoard scoreBoard;

    public InputCompetitionResult(ScoreBoard scoreBoard){
        this.scoreBoard = scoreBoard;
    }

    @Override
    public void exec(){
        System.out.println("请输入对战球队：(Dog,Chicken,Bird,Bear,Fish)\n");
        Scanner scanner =new Scanner(System.in);
        System.out.println("球队1:\n");
        String team1 = scanner.next();
        System.out.println("球队2:\n");
        String team2 = scanner.next();
        System.out.println("请输入胜利球队：\n");
        String winner = scanner.next();
        String loser;
        if(winner.equals(team1)){
            loser = team2;
        }
        else{
            loser = team1;
        }
        scoreBoard.updateScoreBoard(winner,loser);
    }
}
