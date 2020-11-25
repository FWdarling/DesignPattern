package facade;

import entity.Event;

/**
 * description: 子系统类，用于定义产生几种不同的子系统
 * data: 11/18/20 01：49 AM
 * author: cjsmt
 */
public class EventSignUp {
    private Event event;

    public EventSignUp(Event event) {
        this.event = event;
    }

    /**
     * description:处理Athlete的运动报名请求
     * @param name
     */
    public void signUp(String name) {
        String text;
        switch (event){
            case RUN:
                text = "running"; break;
            case FLY:
                text = "flying"; break;
            case SWIM:
                text = "swimming";  break;
            case PING_PONG:
                text = "table tennis";  break;
            default:
                text = event.toString().toLowerCase();  break;
        }
        System.out.println("Dear " + name + ", you have successfully signed up for the " + text + " competition.");
    }
}
