package main.java.abstractfactory.entity;

import main.java.abstractfactory.entity.Result;
import java.util.Vector;

/**
 * 抽象记分员类
 */
public abstract class Scorer {
    protected Vector<Result> results = new Vector<Result>();;

    /**
     * 添加成绩单
     * 将成绩单保存下来
     * 保存 Result 指针，但它可以指向任意子类，以实现 OCP
     * @param result
     */
    public void addResult(Result result){
        results.add(result);

        System.out.println("Scorer: result is added.");
    }

    /**
     * 打印成绩单
     * 打印保存下来的所有成绩单
     */
    public void showResults(){
        for(var result : results){
            result.showResult();
        }

        System.out.println("Scorer: Results is shown.");
    }

    /**
     * 创建女子成绩单
     * 抽象方法，由子类工厂（特定项目记分员）实现
     * @param name
     * @return
     */
    public abstract Result createFemaleResult(String name);

    /**
     * 创建男子成绩单
     * 抽象方法，由子类工厂（特定项目记分员实现）
     * @param name
     * @return
     */
    public abstract Result createMaleResult(String name);
}
