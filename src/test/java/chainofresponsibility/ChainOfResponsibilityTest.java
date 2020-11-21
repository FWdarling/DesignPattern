package chainofresponsibility;

import entity.AbstractReferees;
import org.junit.Test;

public class ChainOfResponsibilityTest {
    /**
     * 构造测试用例
     */
    private static final AbstractReferees referees = SetRefereees.SetRefereees("Unknown","Unknown",true);

    @Test
    public void ChainOfResponsibilityTest() {
        System.out.println("---------------------");
        System.out.println("This is Chain Of Responsibility Test");
        System.out.println("---------------------");
        referees.judgement();
    }


}
