package flyweight;

import entity.Game;
import entity.SportType;

/**
 * description: 享元模式demo调用类
 * date: 11/11/20 2:57 PM
 * author: fourwood
 */
public class FlyWeightDemo {

    /*
     * description: 享元模式演示代码
     * date: 11/26/20 12:53 PM
     * author: fourwood 
     * 
     * @param 
     * @return void
     */ 
    public static void flyWeightTest(){
        System.out.println("                                        [ Game : Game() : 构造函数， 创建比赛 ]");
        Game runGame1 = new Game(SportType.run);
        Game runGame2 = new Game(SportType.run);
        Game runGame3 = new Game(SportType.run);

        System.out.println("                                        [ Game : assignReferee() : 尝试为比赛分配裁判（使用了享元模式） ]");
        runGame1.assignReferee();
        System.out.println("                                        [ Game : getReferee() : 获取为比赛分配好的裁判 ]");
        System.out.println("跑步比赛1的裁判是： " + runGame1.getReferee().getName());
        System.out.println("                                        [ Game : assignReferee() : 尝试为比赛分配裁判（使用了享元模式） ]");
        runGame2.assignReferee();
        System.out.println("                                        [ Game : getReferee() : 获取为比赛分配好的裁判 ]");
        System.out.println("跑步比赛2的裁判是： " + runGame2.getReferee().getName());

        //让1号裁判空闲，再为跑步比赛3分配裁判，测试享元模式
        System.out.println("                                        [ Game : over() : 终止某一场比赛， 修改该比赛的裁判的状态为free ]");
        runGame1.over();
        System.out.println("跑步比赛1结束!");
        System.out.println("                                        [ Game : assignReferee() : 尝试为比赛分配裁判（使用了享元模式） ]");
        runGame3.assignReferee();
        System.out.println("                                        [ Game : getReferee() : 获取为比赛分配好的裁判 ]");
        System.out.println("跑步比赛3的裁判是： " + runGame3.getReferee().getName());
    }
}
