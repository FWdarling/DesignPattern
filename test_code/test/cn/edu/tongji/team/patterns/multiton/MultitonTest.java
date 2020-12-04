package cn.edu.tongji.team.patterns.multiton;

import cn.edu.tongji.team.util.UI;

import java.util.Date;
import org.junit.Test;

/**
 * description:MultitonTest
 * date:12/04/20 16:41 PM
 * author:cjsmt
 */
public class MultitonTest {
    @Test
    public void multitonTest() throws InterruptedException {
        Multiton m0 = Multiton.getInstance(new Date().toString());
        Thread.sleep(1000);
        Multiton m1 = Multiton.getInstance(new Date().toString());
        Thread.sleep(1000);
        Multiton m2 = Multiton.getInstance(new Date().toString());
        Multiton m3 = Multiton.getInstance(new Date().toString());
        UI.printlnWithColor(m0.toString(), UI.Color.BLUE);
        UI.printlnWithColor(m1.toString(), UI.Color.RED);
        UI.printlnWithColor(m2.toString(), UI.Color.YELLOW);
        UI.printlnWithColor(m3.toString(), UI.Color.GREEN);
    }
}



