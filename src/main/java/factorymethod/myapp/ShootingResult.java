package factorymethod.myapp;

import java.util.Vector;
import entity.Result;

/**
 * 射击成绩类
 * 射击成绩由一组整数组成，为连续几次射击的环数
 */
public class ShootingResult extends Result{
    private Vector<Integer> results;

    /**
     * 构造函数
     * 获取运动员姓名，以及各次射击环数，设置计量单位
     * @param name
     * @param results
     */
    public ShootingResult(String name, Vector<Integer> results){
        this.name = name;
        this.results = results;
        this.units = "ring";
    }

    /**
     * 打印成绩单
     * 依次打印姓名、各次射击环数、平均环数
     */
    @Override
    public void showResult(){
        double sum = 0;

        System.out.println("Shooting result of " + name + ":");

        for(Integer result : results){
            System.out.println("\t" + result + " " + units);
            sum += result;
        }

        System.out.println("\tAverage is " + (int)((sum/results.size())*100)/100.0 + " " + units);
    }
}
