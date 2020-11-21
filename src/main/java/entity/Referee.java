package entity;

import java.util.ArrayList;

public class Referee extends AbstractReferees {

    private String name;
    private Game game;
    private boolean bIsBusy;

    /**
     * 构造裁判（使用 String）（责任链模式）
     * @param myJudgement
     */
    public Referee(String myJudgement){
        this.myJudgement = myJudgement;
    }

    public Referee(Game _game, String _name){
        name = _name;
        game = _game;
        bIsBusy = true;
    }

    /**
     * 打印裁判的判罚（责任链模式）
     * @param message String
     */
    @Override
    protected void write(String message) {
        System.out.println("The referee's judgement: " + myJudgement);
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