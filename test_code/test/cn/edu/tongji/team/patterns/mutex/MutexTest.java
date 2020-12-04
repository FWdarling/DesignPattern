package cn.edu.tongji.team.patterns.mutex;

import cn.edu.tongji.team.model.toilet.DesperateEmployee;
import cn.edu.tongji.team.model.toilet.KuaishouToilet;
import cn.edu.tongji.team.model.toilet.MutexLock;
import org.junit.Test;

/**
 * description:MutexTest
 * date: 12/04/20 02:53 AM
 * author:cjsmt
 */
public class MutexTest {
    @Test
    public void mutexTest(){
        //创建一个互斥锁
        MutexLock mutexLock = new MutexLock();
        KuaishouToilet kuaishouToilet = new KuaishouToilet(50, mutexLock);
        DesperateEmployee xiaoA = new DesperateEmployee("小A", kuaishouToilet);
        DesperateEmployee xiaoB = new DesperateEmployee("小B", kuaishouToilet);
        DesperateEmployee xiaoC = new DesperateEmployee("小C", kuaishouToilet);
        //开始调用
        xiaoA.start();
        xiaoB.start();
        xiaoC.start();
    }
}
