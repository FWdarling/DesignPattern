/**
 * 责任链模式
 */
package chainofresponsibility;

import entity.AbstractReferees;
import entity.Assistant;
import entity.Referee;
import entity.Robot;

public class SetReferees {
    /**
     * 初始化一个裁判队列，并初始化每个裁判的判罚，返回首个裁判
     * @return Referee
     */
    public static AbstractReferees SetReferees(String refereeJdj, String assistantJdj, Boolean robotJdj) {
        AbstractReferees referee = new Referee(refereeJdj);
        AbstractReferees assistant = new Assistant(assistantJdj);
        AbstractReferees robot = new Robot(robotJdj);

        System.out.println("                                        " +
                "[ Referee : setNextReferee() : 设置主裁判的下级裁判为助理裁判 ]");
        referee.setNextReferee(assistant);
        System.out.println("                                        " +
                "[ Assistant : setNextReferee() : 设置助理裁判的下级裁判为机器人裁判 ]");
        assistant.setNextReferee(robot);

        return referee;
    }
}
