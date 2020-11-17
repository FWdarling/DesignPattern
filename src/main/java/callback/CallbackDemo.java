package callback;

import callback.entity.ScoreBoard;

import java.util.Scanner;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:41 2020/11/13
 * @Modified By:
 **/
public class CallbackDemo {
    public void CallbackTest(){
        ScoreBoard scoreBoard = new ScoreBoard();
        GetScoreBoard getScoreBoard = new GetScoreBoard(scoreBoard);
        while(true) {
            InputCompetitionResult inputCompetitionResult = new InputCompetitionResult(scoreBoard);
            inputCompetitionResult.executer(getScoreBoard);
            System.out.println("是否所有比赛结束？ 0：是 1：否\n");
            Scanner scanner = new Scanner(System.in);
            int isGameOver = scanner.nextInt();
            if(isGameOver == 0) {
                break;
            }
        }
    }
}
