package frontcontroller;

import entity.ScoreBoard;
import callback.GetScoreBoard;

public class ScoreBoardView {

    /**
     * 打印相关内容
     * @param getScoreBoard
     */
    public void showScoreBoard(GetScoreBoard getScoreBoard)
    {
        getScoreBoard.call();
    }

}
