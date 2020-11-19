package facade;

import entity.Animal;
import entity.Event;

/**
 * description: 鸟类，继承自动物类，默认报名项目为飞行
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class Bird extends Animal {
    public Bird(String name) {
        super(name);
        this.setEventToSignUp(Event.FLY);
    }
}
