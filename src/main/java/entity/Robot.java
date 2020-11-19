package entity;

public class Robot extends AbstractReferees {
    public Robot(String myJudgement){
        this.myJudgement = myJudgement;
    }

    @Override
    protected void write(String message) {
        System.out.println("The robot's judgement: " + myJudgement);
    }
}
