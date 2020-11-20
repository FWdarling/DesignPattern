/**
 * 责任链模式
 */
package chainofresponsibility;

import entity.AbstractReferees;
import entity.Assistant;
import entity.Referee;
import entity.Robot;

public class SetRefereees {
    /**
     * 初始化一个裁判队列，并初始化每个裁判的判罚，返回首个裁判
     * @return Referee
     */
    public static AbstractReferees SetRefereees(String refereeJdj, String assistantJdj, Boolean robotJdj) {
        AbstractReferees referee = new Referee(refereeJdj);
        AbstractReferees assistant = new Assistant(assistantJdj);
        AbstractReferees robot = new Robot(robotJdj);

        referee.setNextReferee(assistant);
        assistant.setNextReferee(robot);

        return referee;
    }
}
