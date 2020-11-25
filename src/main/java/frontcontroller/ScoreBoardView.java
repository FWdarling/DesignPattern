package frontcontroller;

import entity.ScoreBoard;
import callback.GetScoreBoard;

public class ScoreBoardView {

    public void showScoreBoard(GetScoreBoard getScoreBoard)
    {
        getScoreBoard.call();
    }

}
