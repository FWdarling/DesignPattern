package Facade;

import Facade.entity.Bird;
import Facade.entity.Event;
import Facade.entity.Fish;
import Facade.entity.Rabbit;

/**
 * description: 外观模式demo调用类
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class FacadeDemo {

    public static void main(String[] args) {
        Bird bird = new Bird("zhizhi");
        Fish fish = new Fish("paopao");
        Rabbit rabbit = new Rabbit("tiaotiao");

        EventSignUp eventSignUp1 = new EventSignUp(bird);   eventSignUp1.signUp();
        EventSignUp eventSignUp2 = new EventSignUp(fish);   eventSignUp2.signUp();
        EventSignUp eventSignUp3 = new EventSignUp(rabbit); eventSignUp3.signUp();

        rabbit.setEventToSignUp(Event.RUN);
        EventSignUp eventSignUp4 = new EventSignUp(rabbit); eventSignUp4.signUp();
    }
}
