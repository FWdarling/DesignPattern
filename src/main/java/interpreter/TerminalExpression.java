package interpreter;

import java.rmi.UnexpectedException;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,16:16
 * @Version: 1.0
 */

//终态表达式，number


public class TerminalExpression implements Expression{
    private double number;

    //初始化
    TerminalExpression(String str){
        if(Character.isDigit(str.charAt(0))){
            this.number = Double.parseDouble(str);
        }
        else {
            try{
                this.number = getValue(str);
            }catch(UnexpectedException e ){
                e.printStackTrace();
            }
        }

    }

    //根据菜名获得菜品的价格
    public static double getValue(String str) throws UnexpectedException{
        switch (str){
            case Const.FOOD_FRIEDRISE:
                return Const.PRICE_PER_FRIEDRISE;
            case Const.FOOD_GRASS:
                return Const.PRICE_PER_GRASS_DISH;
            case Const.FOOD_WORM:
                return Const.PRICE_PER_WORM_DISH;
            default:
                throw new UnexpectedException("error！不提供该菜品");
        }
    }

    //重写run()方法，实现终结符对于语法树的解析
    @Override
    public double interpret() {
        return number;
    }
}
