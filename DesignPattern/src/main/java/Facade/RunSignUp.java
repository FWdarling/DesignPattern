package Facade;

/**
 * description: 子系统(Sub System)角色,用于报名跑步赛事
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class RunSignUp {
    public void signUp(String name) {
        System.out.println("Dear " + name + ", you have successfully signed up for the " + "running" + " competition.");
    }
}
