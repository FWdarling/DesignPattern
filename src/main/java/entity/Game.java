package entity;
import flyweight.RefereeFactory;

import java.util.ArrayList;

/**
 * description: 比赛实体类
 * date: 11/11/20 12:49 AM
 * author: fourwood
 */
public class Game {

    private Referee referee;
    private final ArrayList<Athlete> athletes;
    private final SportType sportType;

    public Game(SportType sportType){
        this.athletes = new ArrayList<Athlete>();
        this.sportType = sportType;
    }

    public Referee getReferee() {
        return referee;
    }

    public SportType getSportType() {
        return sportType;
    }

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    public boolean remove(Athlete athlete) {
        return athletes.remove(athlete);
    }

    /**
     * description: 调用RefereeFactory的getReferee方法
     *              使用了享元模式来指派裁判
     * date: 11/11/20 1:10 AM
     * author: fourwood
     *
     * @param
     * @return void
     */
    public void assignReferee() {
        referee = RefereeFactory.getReferee(this);
    }

    public void over() {
        referee.setbIsBusy(false);
    }

}
