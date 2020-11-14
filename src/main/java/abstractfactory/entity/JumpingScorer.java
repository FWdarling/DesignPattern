package main.java.abstractfactory.entity;

import main.java.abstractfactory.entity.FemaleJumpingResult;
import main.java.abstractfactory.entity.MaleJumpingResult;
import main.java.abstractfactory.framework.Result;
import main.java.abstractfactory.framework.Scorer;

/**
 * 跳远项目记分员类
 */
public class JumpingScorer extends Scorer {

    /**
     * 创建女子跳远成绩单
     * @param name
     * @return
     */
    public Result createFemaleResult(String name){
        var result = new FemaleJumpingResult(name,5.5);
        System.out.println("JumpingScorer: FemaleJumpingResult of " + name + " is created.");
        return result;
    }

    /**
     * 创建男子跳远成绩单
     * @param name
     * @return
     */
    public Result createMaleResult(String name){
        var result = new MaleJumpingResult(name,5.5);
        System.out.println("JumpingScorer: MaleJumpingResult of " + name + " is created.");
        return result;
    }
}
