package facade;

import entity.Animal;
import entity.Event;

/**
 * description: 外观模式demo调用类
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class FacadeDemo {

    public static void facadeTest(){
        Animal bird = new Bird("zhizhi");
        Animal fish = new Fish("paopao");
        Animal rabbit = new Rabbit("tiaotiao");

        System.out.println("                                        [ RegisterForm : signUp() : 根据Athlete的eventToSignUp属性选择运动项目报名子系统进行报名 ]");
        RegisterForm registerForm1 = new RegisterForm(bird);   registerForm1.signUp();
        RegisterForm registerForm2 = new RegisterForm(fish);   registerForm2.signUp();
        RegisterForm registerForm3 = new RegisterForm(rabbit); registerForm3.signUp();

        rabbit.setEventToSignUp(Event.RUN);
        RegisterForm registerForm4 = new RegisterForm(rabbit); registerForm4.signUp();
    }
}
