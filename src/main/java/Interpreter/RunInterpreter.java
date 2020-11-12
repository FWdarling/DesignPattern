package main.Interpreter;

import main.Interpreter.entity.Const;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,21:09
 * @Version: 1.0
 */
public class RunInterpreter {
    public static void main(String[] args) throws MatchException{
        //这里的实现过于智障，第二版修改更智能一点


        System.out.println("欢迎光临动物竞赛园餐厅！");
        System.out.println("您点单的内容如下：");
        System.out.println("2份炒米饭，1份鲜草食，3份虫宴");
        String exp = "2 * "+ Const.FOOD_FRIEDRISE+" + 1 * "+Const.FOOD_GRASS+" + 3 * "+Const.FOOD_WORM;
        System.out.println("您应当付款：");
        System.out.println(MatchExpression.match(exp).interpret());
    }
}
