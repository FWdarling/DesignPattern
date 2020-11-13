package callback;

import callback.entity.ScoreBoard;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:03 2020/11/13
 * @Modified By:
 **/
public class GetScoreBoard implements Callback{

    private ScoreBoard scoreBoard;

    public GetScoreBoard(ScoreBoard scoreBoard){
        this.scoreBoard = scoreBoard;
    }

    public void call(){
        System.out.println("最新的排行榜：\n");
        System.out.println("球队  胜场  败场  积分\n");
        System.out.println(scoreBoard.getTeamName(0)+"  "+scoreBoard.getTeamWin(0)+"  "+scoreBoard.getTeamLost(0)+"  "+scoreBoard.getTeamScore(0) + "\n");
        System.out.println(scoreBoard.getTeamName(1)+"  "+scoreBoard.getTeamWin(1)+"  "+scoreBoard.getTeamLost(1)+"  "+scoreBoard.getTeamScore(1) + "\n");
        System.out.println(scoreBoard.getTeamName(2)+"  "+scoreBoard.getTeamWin(2)+"  "+scoreBoard.getTeamLost(2)+"  "+scoreBoard.getTeamScore(2) + "\n");
        System.out.println(scoreBoard.getTeamName(3)+"  "+scoreBoard.getTeamWin(3)+"  "+scoreBoard.getTeamLost(3)+"  "+scoreBoard.getTeamScore(3) + "\n");
        System.out.println(scoreBoard.getTeamName(4)+"  "+scoreBoard.getTeamWin(4)+"  "+scoreBoard.getTeamLost(4)+"  "+scoreBoard.getTeamScore(4) + "\n");
    }
}
