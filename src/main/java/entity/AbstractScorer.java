package entity;

import java.util.Vector;

/**
 * description: AbstractScorer
 * date: 11/19/20 6:41 PM
 * author: fourwood
 */
public abstract class AbstractScorer {
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
     * 添加成绩单
     * 在成绩列表中添加成绩
     * @param name
     */
    public void addResult(String name){

    }

    /**
     * 打印成绩单
     * 打印保存下来的所有成绩单
     */
    public void showResults(){
        for(Result result : results){
            result.showResult();
        }

        System.out.println("Scorer: Results is shown.");
    }

}
