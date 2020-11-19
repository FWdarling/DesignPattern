package facade;

import entity.Animal;
import entity.Event;

/**
 * description: 鱼类，继承自动物类，默认报名项目为游泳
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class Fish extends Animal {
    public Fish(String name) {
        super(name);
        this.setEventToSignUp(Event.SWIM);
    }
}
