package chainofresponsibility.entity;

import chainofresponsibility.AbstractReferees;

public class Assistant extends AbstractReferees {
    public Assistant(String myJudgement){
        this.myJudgement = myJudgement;
    }

    @Override
    protected void write(String message) {
        System.out.println("The assistant's judgement: " + myJudgement);
    }
}