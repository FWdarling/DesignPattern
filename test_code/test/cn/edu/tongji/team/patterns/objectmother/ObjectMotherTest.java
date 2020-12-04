package cn.edu.tongji.team.patterns.objectmother;

import cn.edu.tongji.team.model.beans.idler.Boss;
import cn.edu.tongji.team.model.beans.idler.Secretary;
import org.junit.Test;

/**
 *description:ObjectMotherTest
 * date: 12/04/20 15:41 PM
 * author:cjsmt
 */
public class ObjectMotherTest {
    @Test
    public void objectMotherTest() {
        //创建一个清醒的快乐的老板和不性感的秘书
        Boss soberHappyBoss = ObjectMother.createHappyBoss();
        Secretary notFlirtySecretary = ObjectMother.createNotFlirtySecretary();
        Secretary flirtySecretary = ObjectMother.createFlirtySecretary();
        //不性感的秘书调情
        soberHappyBoss.flirt(notFlirtySecretary);
        System.out.println(soberHappyBoss.isHappy());
        //另一天，老板恢复了好心情，且又喝醉了
        soberHappyBoss.makeHappy();
        soberHappyBoss.makeDrunk();
        System.out.println(soberHappyBoss.isHappy());
        //性感的秘书调情
        soberHappyBoss.flirt(flirtySecretary);
        System.out.println(soberHappyBoss.isHappy());
    }
}
