package prototypedeepcopy;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/21,12:41
 * Version: 1.0
 */
public class Prize implements Cloneable{
    private PrizeDetail prizeDetail;

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

    public PrizeDetail getPrizeName(){
        return prizeDetail;
    }

    public void setPrizeDetail(PrizeDetail prizeDetail){
        this.prizeDetail = prizeDetail;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
