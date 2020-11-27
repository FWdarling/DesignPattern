package state;

/**
 * 状态模式 Demo 类
 * 拥有一个静态方法，用于运行状态模式 Demo
 */
public class StateDemo {
    /**
     * 运行状态模式 Demo
     * 1. 首先创建两个运动员
     * 2. 比赛中给运动员 1、2 加分，每次加分都打印一次场上比分
     * 3. 当有运动员达到 11 分时，另一名认输
     */
    public static void runStateDemo(){
        PingpongAthlete athlete1=new PingpongAthlete();
        PingpongAthlete athlete2=new PingpongAthlete();

        System.out.println("                                        [ PingpongAthlete : addScore() : 给运动员加分 ]");
        System.out.println("                                        [ PingpongAthlete : lost() : 运动员认输 ]");

        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        athlete2.lost();
        showGameState(athlete1, athlete2);
    }

    /**
     * 打印场上比分
     * @param athlete1
     * @param athlete2
     */
    private static void showGameState(PingpongAthlete athlete1,PingpongAthlete athlete2){
        System.out.println("Athlete1:");
        athlete1.showState();
        System.out.println("Athlete2:");
        athlete2.showState();
    }
}
