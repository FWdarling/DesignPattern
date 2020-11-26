package prototypedeepcopy;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/21,12:41
 * Version: 1.0
 */
public class Prize implements Cloneable{
    //奖品类

    private PrizeDetail prizeDetail;

    //初始化，根据奖项等级对应具体奖品
    Prize(AwardLevel awardLevel){
        switch (awardLevel){
            case FPRSTPRIZE:
                prizeDetail =  PrizeDetail.BakedToast;
            case SECONDPRIZE:
                prizeDetail =  PrizeDetail.DeliciousBeans;
            default:
                prizeDetail =  PrizeDetail.GrassSet;
        }
    }

    //获取奖品的名字
    public PrizeDetail getPrizeName(){
        return prizeDetail;
    }

    //设置具体的奖品
    public void setPrizeDetail(PrizeDetail prizeDetail){
        this.prizeDetail = prizeDetail;
    }

    //深克隆里面对象也需要克隆，所以重写Prize类的clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
