package main.Interpreter;

import java.rmi.UnexpectedException;
import main.Interpreter.entity.Const;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,16:16
 * @Version: 1.0
 */

//终态表达式，number


public class TerminalExpression implements Expression{
    private double number;

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

    @Override
    public double interpret() {
        return number;
    }
}
