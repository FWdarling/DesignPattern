package frontcontroller;
import callback.GetScoreBoard;
import entity.ScoreBoard;

public class ScoreBoardController {
    private ScoreBoard model;
    private ScoreBoardView view;

    /**
     * 构造函数
     * @param model
     * @param view
     */
    public ScoreBoardController(ScoreBoard model,ScoreBoardView view) {
        this.model=model;
        this.view=view;
    }

    /**
     * 打印相关内容
     * @param scoreBoard
     */
    public void printDetails(ScoreBoard scoreBoard)
    {
        GetScoreBoard getScoreBoard = new GetScoreBoard(scoreBoard);
        view.showScoreBoard(getScoreBoard);
    }

}
