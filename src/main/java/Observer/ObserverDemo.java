package Observer;

import Observer.Entity.Game;
import Observer.Entity.Referee;
import Observer.Entity.SportType;

/**
 * description: 观察者模式demo调用类
 * date: 11/11/20 2:39 AM
 * author: fourwood
 */
public class ObserverDemo {

    public static void observerTest(){
        Game swimGame1 = new Game(SportType.swim);
        Game runGame1 = new Game(SportType.run);

        RunAthlete runAthlete1 = new RunAthlete("1号跑步运动员");
        runGame1.addAthlete(runAthlete1);
        RunAthlete runAthlete2 = new RunAthlete("2号跑步运动员");
        runGame1.addAthlete(runAthlete2);
        runGame1.assignReferee();
        Referee runReferee1 = runGame1.getReferee();

        SwimAthlete swimAthlete1 = new SwimAthlete("1号游泳运动员");
        swimGame1.addAthlete(swimAthlete1);
        SwimAthlete swimAthlete2 = new SwimAthlete("2号游泳运动员");
        swimGame1.addAthlete(swimAthlete2);
        swimGame1.assignReferee();
        Referee swimReferee1 = swimGame1.getReferee();

        System.out.println(runReferee1.getName() + "宣布1号跑步比赛开始！");
        runReferee1.announce();

        System.out.println(swimReferee1.getName() + "宣布1号游泳比赛开始！");
        swimReferee1.announce();
    }
}
