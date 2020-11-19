package flyweight;

import entity.Game;
import entity.SportType;

/**
 * description: 享元模式demo调用类
 * date: 11/11/20 2:57 PM
 * author: fourwood
 */
public class FlyWeightDemo {

    public static void flyWeightTest(){
        Game runGame1 = new Game(SportType.run);
        Game runGame2 = new Game(SportType.run);
        Game runGame3 = new Game(SportType.run);

        runGame1.assignReferee();
        System.out.println("跑步比赛1的裁判是： " + runGame1.getReferee().getName());
        runGame2.assignReferee();
        System.out.println("跑步比赛2的裁判是： " + runGame2.getReferee().getName());

        //让1号裁判空闲，再为跑步比赛3分配裁判，测试享元模式
        runGame1.over();
        runGame3.assignReferee();
        System.out.println("跑步比赛3的裁判是： " + runGame3.getReferee().getName());
    }
}
