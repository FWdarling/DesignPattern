package entity;

import java.util.concurrent.TimeUnit;

/**
 * description: 运动员类，物种属性的载体
 * data: 11/13/20 17:25 PM
 * author: cjsmt
 */
public class Athlete extends AbstractAthlete {
    private Species species;
    protected String sportsType;
    private Mass mass;
    private FoodType foodType;

    public Athlete(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    public Athlete(String _name,String _sportsType){
        name = _name;
        sportsType = _sportsType;
    }

    public Athlete(String name, Mass mass, FoodType foodType){
        this.foodType = foodType;
        this.mass = mass;
        this.name = name;
    }

    public Athlete(String name){
        this.name=name;
    }

    public Species getSpecies() {
        return species;
    }


    public String getSportsType(){
        return sportsType;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public Mass getMass() {
        return mass;
    }

    /**
     * description: 听到裁判宣布比赛开始，运动员作出的行动
     *              观察者模式中使用
     * date: 11/11/20 1:23 AM
     * author: fourwood
     *
     * @param
     * @return void
     */
     public void start(){};

    /**
     * 采访
     *
     * @param questions 采访提问的String数组
     * @return 返回采访是否成功
     * @throws InterruptedException timeunit sleep被打断异常抛出
     */
    public boolean interview(String[] questions) throws InterruptedException {
//        运动员介绍
        System.out.println(this.name + " is a " + this.species);
//        采访开始
        System.out.println("The interview is start!");
//        回答每一个问题
        for (String question : questions
        ) {
            System.out.println(name + " answered the question: " + question);
            TimeUnit.SECONDS.sleep(1);
        }
//        采访结束
        System.out.println("The interview is over!");
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s [foodType=%s, mass=%s]",
                name, foodType, mass);
    }
}
