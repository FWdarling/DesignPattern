package entity;

public class Assistant extends AbstractReferees {
    /**
     * 构造助理裁判（使用 String）（责任链模式）
     * @param myJudgement
     */
    public Assistant(String myJudgement){
        this.myJudgement = myJudgement;
    }

    @Override
    protected void write(String message) {
        System.out.println("The assistant's judgement: " + myJudgement);
    }
}