package entity;

public class Robot extends AbstractReferees {
    /**
     * 需要一个明确的 True / False 来构造机器人的判罚（责任链模式）
     * 无法通过传递 String 来构造
     * @param robotJudgement Boolean
     */
    public Robot(boolean robotJudgement) {
        if(robotJudgement) {
            this.myJudgement = "Goal";
        }
        else {
            this.myJudgement = "Not Goal";
        }
    }

    /**
     * 打印机器人裁判的判罚
     * @param message String
     */
    @Override
    protected void write(String message) {
        System.out.println("The robot's judgement: " + myJudgement);
    }
}
