package Facade;

import Facade.entity.Animal;

/**
 * description: 外观(Facede)角色,为报名各比赛项目提供接口
 * data: 11/13/20 01:30 AM
 * author: cjsmt
 */
public class EventSignUp {
    private Animal athlete;
    private RunSignUp runSignUp = new RunSignUp();
    private SwimSignUp swimSignUp = new SwimSignUp();
    private FlySignUp flySignUp = new FlySignUp();
    private HighJumpSignUp highJumpSignUp = new HighJumpSignUp();
    private LongJumpSignUp longJumpSignUp = new LongJumpSignUp();
    private BasketballSignUp basketballSignUp = new BasketballSignUp();
    private PingPongSignUp pingPongSignUp = new PingPongSignUp();
    private BadmintonSignUp badmintonSignUp = new BadmintonSignUp();


    public EventSignUp(Animal athlete) {
        this.athlete = athlete;
    }
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
                pingPongSignUp.signUp(athlete.getName());
                break;
            case BADMINTON:
                badmintonSignUp.signUp(athlete.getName());
                break;
            default:
                break;
        }
    }
}
