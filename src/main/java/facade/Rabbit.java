package facade;

import entity.Animal;
import entity.Event;

/**
 * description: 兔子类，继承自动物类，默认报名项目为跳远
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
        this.setEventToSignUp(Event.LONG_JUMP);
    }
}
