package main.java.nullobject.myapp;

import main.java.nullobject.entity.AbstractAthlete;

/**
 * 空运动员
 * 用于答到时告知该运动员不在
 */
public class NullAthlete extends AbstractAthlete {
    public NullAthlete(String name){
        this.name=name;
    }

    /**
     * 答到上场的空操作
     * 告知人不在
     */
    @Override
    public void play() {
        System.out.println(name+"不在！");
    }
}
