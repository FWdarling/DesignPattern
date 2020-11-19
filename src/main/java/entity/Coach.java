package entity;

import entity.AbstractAthlete;
import entity.Athlete;
import nullobject.myapp.NullAthlete;

import java.util.Vector;

/**
 * 教练类
 * 拥有一个方法：named（点名）
 * @author liangrongjia
 */
public class Coach {
    /**
     * 点名方法
     * 接收实到名单，和待点名字
     * 如果实到名单里有待点的运动员，则返回该运动员的对象
     * 如果实到名单里无待点的运动员，则返回空对象
     * @param list
     * @param name
     * @return
     */
    public AbstractAthlete named(Vector<String> list, String name){
        boolean isInList = false;
        for(String athleteName : list){
            if(athleteName.equals(name)){
                isInList = true;
            }
        }
        if(isInList){
            return new Athlete(name);
        }
        else {
            return new NullAthlete(name);
        }
    }
}
