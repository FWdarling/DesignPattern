package nullobject;

import entity.Coach;

import java.util.Vector;

/**
 * 空对象模式 Demo 类
 * 拥有一个静态方法，用于运行空对象模式的 Demo
 * @author liangrongjia
 */
public class NullObjectDemo {
    /**
     * 方法运行空对象模式 Demo
     * 场景设定为：教练点运动员上场，点到的答到上场，点到没来的，则产生一个虚假人，声明该运动员缺席
     * 1. 首先构造实到运动员名单
     * 2. 然后点名，点名将返回 Athlete, play() 将答到上场。
     */
    public static void runNullObjectDemo(){

        Coach coach = new Coach();

        Vector<String> list = new Vector<String>();     //实到运动员名单
        list.add("Abby");
        list.add("Bob");
        list.add("Cindy");

        System.out.println("                                        [ Coach : named(Vector<String> list, String name) : 教练点名 ]");

        coach.named(list,"Abby").play();          //点名上场
        coach.named(list,"Daivy").play();         //点到不存在的人
    }
}
