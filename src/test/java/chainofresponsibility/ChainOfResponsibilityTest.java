package chainofresponsibility;

import chainofresponsibility.entity.Assistant;
import chainofresponsibility.entity.Referee;
import chainofresponsibility.entity.Robot;
import org.junit.Test;

public class ChainOfResponsibilityTest {
    /**
     * 初始化一个裁判队列，并初始化每个裁判的判罚，返回首个裁判
     * @return Referee
     */
    private static AbstractReferees getAbstractReferees() {
        AbstractReferees referee = new Referee("Unknown");
        AbstractReferees assistant = new Assistant("Unknown");
        AbstractReferees robot = new Robot("Goal");

        referee.setNextReferee(assistant);
        assistant.setNextReferee(robot);

        return referee;
    }

    @Test
    public void ChainOfResponsibilityTest() {
        System.out.println("---------------------");
        System.out.println("This is Chain Of Responsibility Test");
        System.out.println("---------------------");
        AbstractReferees referees = getAbstractReferees();
        referees.judgement();
    }


}
