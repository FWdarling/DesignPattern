package factorymethod.myapp;

import entity.Result;

/**
 * 赛跑成绩单类
 */
public class RaceResult extends Result{
    private double result;

    /**
     * 构造函数
     * 获取运动员姓名、成绩值，并设置单位
     * @param name
     * @param result
     */
    public RaceResult(String name, double result){
        this.name = name;
        this.result = result;
        this.units = "s";
    }

    /**
     * 打印成绩
     * 打印姓名、成绩、单位
     */
    @Override
    public void showResult(){
        System.out.println("Race result of " + name + ": " + result + units);
    }
}
