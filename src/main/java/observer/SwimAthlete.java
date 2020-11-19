package observer;

import entity.Athlete;

/**
 * description: 游泳运动员类，继承于Athlete类，观察者模式使用
 * date: 11/11/20 2:34 AM
 * author: fourwood
 */
public class SwimAthlete extends Athlete {
    
    public SwimAthlete(String _name) {
        super(_name);
    }

    /**
     * description: 重载父类Athlete中的start函数， 对裁判的通告作出反应
     * date: 11/11/20 2:41 AM
     * author: fourwood 
     *
     * @param 
     * @return void
     */ 
    @Override
    public void start(){
        System.out.println("Response: Athlete " + name + " is swimming!");
    }
}
