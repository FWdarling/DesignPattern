package main.interpreter;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,19:39
 * @Version: 1.0
 */
public class MatchException extends Exception{
    public MatchException(String msg){
        System.out.println("Match Error Occur:"+msg);
    }
}
