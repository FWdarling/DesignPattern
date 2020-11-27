package prototypedeepcopy;


/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/21,12:35
 * Version: 1.0
 */

/* Prototype 分为深克隆和浅克隆两类,
 * 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 */

public class Certificate implements Cloneable{
    //奖状类 for 浅克隆
    private String name;
    private String sportsType;
    private AwardLevel prizeLevel;
    private Prize prize; //对应的奖品（为了验证深复制和浅复制）
    private final String template1 = ",恭喜你在";
    private final String template2 = "比赛中获得";

    //初始化
    public Certificate(String name, String sportsType, AwardLevel awardLevel){
        this.name = name;
        this.sportsType = sportsType;
        this.prizeLevel = awardLevel;
        //this.prize = fitPrize(awardLevel);
        this.prize = new Prize(awardLevel);
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
    public void setPrizeLevel(AwardLevel awardLevel){
        this.prizeLevel = awardLevel;
        //this.prize = fitPrize(prizeLevel);
        this.prize = new Prize(awardLevel);
    }
    //打印奖状
    public void printCertificate(){
        System.out.println(name + template1 + sportsType + template2 + prizeLevel);
        System.out.println("获得奖品：" + prize.getPrizeName());
        System.out.println("奖品ID： " + prize.hashCode());
    }


    //重写clone()，实现深克隆
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("【深克隆】奖状复制生成成功，且同时完成特定信息修改");
        Certificate certificate  = null;
        try{
            certificate = (Certificate)super.clone();
            certificate.prize = (Prize)prize.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return certificate;
    }
}
