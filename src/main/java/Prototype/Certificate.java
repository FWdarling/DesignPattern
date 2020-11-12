package main.Prototype;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,10:57
 * @Version: 1.0
 */
public class Certificate implements Cloneable {
//奖状类
    private String name;
    private String sportsType;
    private Prize prizeLevel;
    private final String template1 = ",恭喜你在";
    private final String template2 = "比赛中获得";

    public Certificate(String name,String sportsType,Prize prizeLevel){
        this.name = name;
        this.sportsType = sportsType;
        this.prizeLevel = prizeLevel;
        System.out.println("成功创建奖状！");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSportsType(String sportsType){
        this.sportsType = sportsType;
    }

    public void setPrizeLevel(Prize prizeLevel){
        this.prizeLevel = prizeLevel;
    }
    public void printCertificate(){
        System.out.println(name + template1 + sportsType + template2 + prizeLevel);
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        System.out.println("奖状复制生成成功，且同时完成特定信息修改");
        //return (Certificate)super.clone();
        Certificate certificate  = null;
        try{
            certificate = (Certificate)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return certificate;
    }


}


