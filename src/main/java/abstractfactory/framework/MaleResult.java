package abstractfactory.framework;

import entity.Result;

/**
 * 抽象男子成绩单类
 * 实现打印男子成绩单的所有评价等级，与女子有区别
 */
public abstract class MaleResult extends Result {
    /**
     * 打印所有评价等级
     */
    public void showAllGrade(){
        System.out.println("MaleResult have 5 grade: A B C D E");
    }
}
