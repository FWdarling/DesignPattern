package frontcontroller;
import callback.GetScoreBoard;
import entity.ScoreBoard;

public class ScoreBoardController {
    private ScoreBoard model;
    private ScoreBoardView view;


    public ScoreBoardController(ScoreBoard model,ScoreBoardView view) {
        this.model=model;
        this.view=view;
    }

    public void printDetails(ScoreBoard scoreBoard)
    {
        GetScoreBoard getScoreBoard = new GetScoreBoard(scoreBoard);
        view.showScoreBoard(getScoreBoard);
    }

}
