package main.Interpreter;



/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,19:33
 * @Version: 1.0
 */
public class MatchExpression {
    public static Expression match(String expression) throws MatchException{
        String[] nodes = expression.split(" ");

        System.out.println("输入表达式（expression)："+expression);
        return match(nodes,0,nodes.length);
    }


    //start：开始的下标
    //end: 最后一个元素的下标+1
    public static Expression match(String[] nodes,int start,int end)throws MatchException{
        if(start == end){
            return null;
        }else if(start == end - 1){
            return new TerminalExpression(nodes[start]);
        }

        assert end-start>=3;

        //AddExpression
        for(int i = start+1; i < end; i++){
            int op = isOPerator(nodes[i]);
            if(op == 1){
                return new AddExpression(match(nodes,start,i),match(nodes,i+1,end)); //第i项保留出来，因为这里判定了第i项是‘+’ operator
            }
        }
        //MultipleExpression
        for(int i = start+1; i < end; i++){
            int op = isOPerator(nodes[i]);
            if(op == 2){
                return new MultipleExpression(match(nodes,start,i),
                        match(nodes,i+1,end));
            }
        }

        throw new MatchException("Invalid Expression! 错误计算式输入");
    }


    static int isOPerator(String str){
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
