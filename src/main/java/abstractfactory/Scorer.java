package abstractfactory;

import entity.AbstractScorer;
import entity.Result;

import java.util.Vector;

/**
 * 抽象记分员类
 */
public abstract class Scorer extends AbstractScorer {

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
