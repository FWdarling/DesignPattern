package facade;

import entity.Animal;
import entity.Event;

/**
 * description: 外观(Facede)角色,为报名各比赛项目提供接口
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class RegisterForm {
    private Animal athlete;
    private EventSignUp runSignUp = new EventSignUp(Event.RUN);
    private EventSignUp swimSignUp = new EventSignUp(Event.SWIM);
    private EventSignUp flySignUp = new EventSignUp(Event.FLY);
    private EventSignUp highJumpSignUp = new EventSignUp(Event.HIGH_JUMP);
    private EventSignUp longJumpSignUp = new EventSignUp(Event.LONG_JUMP);
    private EventSignUp basketballSignUp = new EventSignUp(Event.BASKETBALL);
    private EventSignUp pingpongSignUp = new EventSignUp(Event.PING_PONG);
    private EventSignUp badmintonSignUp = new EventSignUp(Event.BADMINTON);


    public RegisterForm(Animal athlete) {
        this.athlete = athlete;
    }

    /**
     * description:根据Athlete的eventToSignUp属性选择运动项目报名子系统
     */
    public void signUp() {
        switch (athlete.getEventToSignUp()) {
            case RUN:
                runSignUp.signUp(athlete.getName());
                break;
            case SWIM:
                swimSignUp.signUp(athlete.getName());
                break;
            case FLY:
                flySignUp.signUp(athlete.getName());
                break;
            case HIGH_JUMP:
                highJumpSignUp.signUp(athlete.getName());
                break;
            case LONG_JUMP:
                longJumpSignUp.signUp(athlete.getName());
                break;
            case BASKETBALL:
                basketballSignUp.signUp(athlete.getName());
                break;
            case PING_PONG:
                pingpongSignUp.signUp(athlete.getName());
                break;
            case BADMINTON:
                badmintonSignUp.signUp(athlete.getName());
                break;
            default:
                break;
        }
    }
}
