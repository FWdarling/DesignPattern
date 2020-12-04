package cn.edu.tongji.team.patterns.marker;

import cn.edu.tongji.team.model.beans.Thief;
import cn.edu.tongji.team.model.beans.worker.Guard;
import cn.edu.tongji.team.model.beans.worker.Permission;
import org.junit.Test;

/**
 * description：MarkerTest
 * date: 12/04/20 00:46 AM
 * author: cjsmt
 */

public class MarkerTest {
    @Test
    public void markerTest() {
        //初始化实例
        Guard guard1 = new Guard();
        Guard guard2 = new Guard();
        Guard guard3 = new Guard();
        Guard guard4 = new Guard();
        Thief thief = new Thief();

        //检查是否允许进入
        if (guard1 instanceof Permission) {
            guard1.enter();
        } else {
            System.out.println("发现可疑人士！！");
        }

        //检查是否允许进入
        if (guard2 instanceof Permission) {
            guard2.enter();
        } else {
            System.out.println("发现可疑人士！！");
        }

        //检查是否允许进入
        if (guard3 instanceof Permission) {
            guard3.enter();
        } else {
            System.out.println("发现可疑人士！！");
        }

        //检查是否允许进入
        if (guard4 instanceof Permission) {
            guard4.enter();
        } else {
            System.out.println("发现可疑人士！！");
        }

        //检查是否允许进入
        if (thief instanceof Permission) {
            thief.steal();
        } else {
            System.out.println("发现可疑人士！！");
        }
    }
}
