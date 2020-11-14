package main.java.factorymethod.framework;

import java.util.Vector;

/**
 * 记分员类
 * 拥有成绩列表，保存各个运动员的成绩单
 */
public abstract class Scorer {
    protected Vector<Result> results = new Vector<Result>();;

    /**
     * 添加成绩单
     * 在成绩列表中添加成绩
     * @param name
     */
    public void addResult(String name){

        results.add(createResult(name));

        System.out.println("Scorer: result is added.");
    }

    /**
     * 打印成绩
     * 打印成绩列表中的所有人的成绩
     */
    public void showResults(){
        for(var result : results){
            result.showResult();
        }

        System.out.println("Scorer: Results is shown.");
    }

    /**
     * 创建成绩单
     * 根据项目的不同，成绩单不同，具体是什么成绩单，由子类实现
     * @param name
     * @return
     */
    public abstract Result createResult(String name);
}
