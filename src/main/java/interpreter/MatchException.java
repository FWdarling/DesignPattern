package interpreter;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,19:39
 * @Version: 1.0
 */
public class MatchException extends Exception{
    //异常处理
    public MatchException(String msg){
        System.out.println("Match Error Occur:"+msg);
    }
}
