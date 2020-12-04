package cn.edu.tongji.team.patterns.privateclassdata;

import cn.edu.tongji.team.model.beans.matchaStew.Stew;
import org.junit.Test;

/**
 * description: privateClassDataTest
 * date: 12/3/20 6:35 PM
 * author: fourwood
 */
public class PrivateClassDataTest {

    @Test
    public void privateClassDataTest() {
        Stew stew = new Stew(1234, 1, 3, 444);
        stew.mix();
        stew.taste();
        stew.mix();

        stew = new Stew(1234, 0, -2, 444);
        stew.mix();
        stew.taste();
        stew.mix();
    }
}
