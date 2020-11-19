package abstractfactory.framework;

import entity.Result;

/**
 * 抽象女子成绩单类
 * 实现打印女子成绩评价等级，与男子有区别
 */
public abstract class FemaleResult extends Result {
    /**
     * 打印女子成绩单所有评价等级
     */
    public void showAllGrade(){
        System.out.println("FemaleResult have 4 grade: A B C D");
    }
}
