package prototype;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,10:57
 * @Version: 1.0
 */
public class Certificate implements Cloneable {
//奖状类 for 浅克隆
    private String name;
    private String sportsType;
    private AwardLevel prizeLevel;
    private Prize prize; //对应的奖品（为了验证深复制和浅复制）
    private final String template1 = ",恭喜你在";
    private final String template2 = "比赛中获得";

    //初始化
    public Certificate(String name, String sportsType, AwardLevel prizeLevel){
        this.name = name;
        this.sportsType = sportsType;
        this.prizeLevel = prizeLevel;
        this.prize = fitPrize(prizeLevel);
        System.out.println("成功创建奖状！");
    }

    //设置姓名
    public void setName(String name){
        this.name = name;
    }

    //设置运动类型
    public void setSportsType(String sportsType){
        this.sportsType = sportsType;
    }

    //设置奖项等级
    public void setPrizeLevel(AwardLevel prizeLevel){
        this.prizeLevel = prizeLevel;
        this.prize = fitPrize(prizeLevel);
    }
    //打印奖状
    public void printCertificate(){
        System.out.println(name + template1 + sportsType + template2 + prizeLevel);
        System.out.println("获得奖品：" + prize);
        System.out.println("奖品ID： " + prize.hashCode());
    }

    //适配奖品和获奖等级
    private Prize fitPrize(AwardLevel awardLevel){
        switch (awardLevel){
            case FPRSTPRIZE:
                return Prize.BakedToast;
            case SECONDPRIZE:
                return Prize.DeliciousBeans;
            default:
                return Prize.GrassSet;
        }
    }

    //重写clone()实现浅克隆
    @Override
    public Object clone() throws CloneNotSupportedException{
        System.out.println("【浅克隆】奖状复制生成成功，且同时完成特定信息修改");
        Certificate certificate  = null;
        try{
            certificate = (Certificate)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return certificate;
    }


}


