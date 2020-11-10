package Observer.Entity;

import java.util.ArrayList;

/**
 * description: 裁判实体类，观察者模式中的观察者
 * date: 11/11/20 1:02 AM
 * author: fourwood
 */
public class Referee {
    private Game game;
    private boolean bIsBusy;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public boolean getbIsBusy() {
        return bIsBusy;
    }

    public void setbIsBusy(boolean bIsBusy) {
        this.bIsBusy = bIsBusy;
    }

    /**
     * description: 裁判宣布比赛开始，在观察者模式中使用
     * date: 11/11/20 1:16 AM
     * author: fourwood
     *
     * @param
     * @return void
     */
    public void announce(){
        ArrayList<Athlete> athletes = game.getAthletes();
        for(Athlete athlete : athletes){
            athlete.start();
        }
    }
}
