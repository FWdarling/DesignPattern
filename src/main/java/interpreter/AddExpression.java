package interpreter;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,16:57
 * @Version: 1.0
 */
public class AddExpression implements Expression {
    //left、right不一定是number终结符，也可能是其他的非终结符
    private Expression _left, _right;

    //初始化
    public AddExpression(Expression left, Expression right){
        this._left = left;
        this._right = right;
    }

    //完成该语法表达式的左边部分和右边部分的计算操作，这里为加法操作
    @Override
    public double interpret(){
        return _left.interpret() + _right.interpret();
    }
}
