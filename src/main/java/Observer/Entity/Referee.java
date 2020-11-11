package Observer.Entity;

import java.util.ArrayList;

/**
 * description: 裁判实体类，观察者模式中的观察者
 * date: 11/11/20 1:02 AM
 * author: fourwood
 */
public class Referee {
    private final String name;
    private Game game;
    private boolean bIsBusy;

    public Referee(Game _game, String _name){
        name = _name;
        game = _game;
        bIsBusy = true;
    }

    public String getName() {
        return name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
        this.bIsBusy = true;
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
