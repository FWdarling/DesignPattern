package callback;

import entity.ScoreBoard;


/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:03 2020/11/13
 * @Modified By:
 **/
public class GetScoreBoard implements Callback{

    private ScoreBoard scoreBoard;

    /**
     Construct for GetScoreBoard.

     Args:
        ScoreBoard scoreBoard: An object to store the competition results.
     */
    public GetScoreBoard(ScoreBoard scoreBoard){
        this.scoreBoard = scoreBoard;
    }

    /**
     callback is called when a process comes to an end. It will callback therefore to inform the caller. The call function
     is used to realize the specific process of a unique callback procedure.

     Args:

     Return Value:

     Example:
     >> Callback callback = new Callback();
     >> callback.call();
     **/
    @Override
    public void call(){
        System.out.println("最新的排行榜：\n");
        System.out.println("球队  胜场  败场  积分\n");
        int teams=scoreBoard.getTeamSum();

        for(int i=0;i<teams;i++) {
            System.out.println(scoreBoard.getTeamName(i) + "  " + scoreBoard.getTeamWin(i) + "  " + scoreBoard.getTeamLost(i) + "  " + scoreBoard.getTeamScore(i) + "\n");
        }

    }
}
