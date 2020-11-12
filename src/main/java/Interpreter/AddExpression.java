package main.Interpreter;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,16:57
 * @Version: 1.0
 */
public class AddExpression implements Expression {
    //left、right不一定是number终结符，也可能是其他的非终结符
    private Expression _left, _right;

    public AddExpression(Expression left, Expression right){
        this._left = left;
        this._right = right;
    }

    @Override
    public double interpret(){
        return _left.interpret() + _right.interpret();
    }
}
