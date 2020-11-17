package chainofresponsibility.entity;

import chainofresponsibility.AbstractReferees;

public class Referee extends AbstractReferees {
    public Referee(String myJudgement){
        this.myJudgement = myJudgement;
    }

    @Override
    protected void write(String message) {
        System.out.println("The referee's judgement: " + myJudgement);
    }
}