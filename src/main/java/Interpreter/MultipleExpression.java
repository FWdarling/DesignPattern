package main.Interpreter;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,17:04
 * @Version: 1.0
 */
public class MultipleExpression implements  Expression{
    private Expression _left,_right;

    MultipleExpression(Expression left, Expression right){
        this._left = left;
        this._right = right;
    }

    @Override
    public double interpret(){
        return  _left.interpret()*_right.interpret();
    }
}
