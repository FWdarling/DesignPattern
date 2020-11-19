/**
 * @author Mew Y
 * @version 0.1
 * @description 责任链模式：裁判队列（AbstractReferees）类
 */
package entity;

public abstract class AbstractReferees {
    /**
     * 责任链的下级
     */
    protected AbstractReferees nextReferee;

    /**
     * 该裁判的判罚
     */
    protected String myJudgement;

    /**
     * 指定责任链的下级
     * @param nextReferee AbstractReferees
     */
    public void setNextReferee(AbstractReferees nextReferee) {
        this.nextReferee = nextReferee;
    }

    /**
     * 判罚并判断是否需要传递给下级继续判罚
     */
    public void judgement() {
        write(myJudgement);
        if(nextReferee !=null && myJudgement.equals("Unknown")){
            nextReferee.judgement();
        }
    }

    /**
     * 打印该裁判的判罚
     * @param message String
     */
    abstract protected void write(String message);
}
