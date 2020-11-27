package interpreter;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,17:04
 * @Version: 1.0
 */
public class MultipleExpression implements  Expression{
    private Expression _left,_right;

    //初始化
    MultipleExpression(Expression left, Expression right){
        this._left = left;
        this._right = right;
    }

    //完成该语法表达式的左边部分和右边部分的计算操作，这里为乘法操作
    @Override
    public double interpret(){
        return  _left.interpret()*_right.interpret();
    }
}
