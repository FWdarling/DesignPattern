package observer;

import entity.Athlete;

/**
 * description: 跑步运动员类，继承于Athlete类，观察者模式使用
 * date: 11/11/20 2:27 AM
 * author: fourwood
 */
public class RunAthlete extends Athlete {

    public RunAthlete(String _name) {
        super(_name);
    }

    /**
     * description: 重载父类Athlete中的start函数， 对裁判的通告作出反应
     * date: 11/11/20 2:32 AM
     * author: fourwood
     *
     * @param
     * @return void
     */
    @Override
    public void start(){
        System.out.println("Response: Athlete " + name + " is running!");
    }
}
