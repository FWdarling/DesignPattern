package interpreter;



/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,19:33
 * @Version: 1.0
 */
public class MatchExpression {
    //接受expression表达式整体，将表达式每个部分拆分并记录在nodes[]里
    public static Expression match(String expression) throws MatchException{
        String[] nodes = expression.split(" ");

        System.out.println("输入表达式（expression)："+expression);
        return match(nodes,0,nodes.length);
    }


    //接受拆分后的表达式的元素nodes[]，然后进行语法树的分析
    //start：开始的下标
    //end: 最后一个元素的下标+1
    public static Expression match(String[] nodes,int start,int end)throws MatchException{
        if(start >= end){
            throw new MatchException("表达式长度有误");
        }else if(start == end - 1){
            return new TerminalExpression(nodes[start]);
        }


        //AddExpression
        for(int i = start+1; i < end; i++){
            int op = isOperator(nodes[i]);
            if(op == 1){
                return new AddExpression(match(nodes,start,i),match(nodes,i+1,end)); //第i项保留出来，因为这里判定了第i项是‘+’ operator
            }
        }
        //MultipleExpression
        for(int i = start+1; i < end; i++){
            int op = isOperator(nodes[i]);
            if(op == 2){
                return new MultipleExpression(match(nodes,start,i),
                        match(nodes,i+1,end));
            }
        }

        throw new MatchException("Invalid Expression! 错误计算式输入");
    }

    //判断具体的操作符
    static int isOperator(String str){
        switch (str.charAt(0)){
            case '+':
                return 1;
            case '*':
                return 2;
            default:
                return 0; //不是 operator
        }
    }

}
