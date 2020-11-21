package callback;

import entity.ScoreBoard;


/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:41 2020/11/13
 * @Modified By:
 **/
public class CallbackDemo {
    static public void callbackTest(){
        ScoreBoard scoreBoard = new ScoreBoard();

        GetScoreBoard getScoreBoard = new GetScoreBoard(scoreBoard);

        for(int i=0;i<5;i++){
            Competition competition = new Competition(scoreBoard);
            competition.executer(getScoreBoard);
        }

    }
}
