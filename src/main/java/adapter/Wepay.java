package adapter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 20:34 2020/11/12
 * @Modified By:
 **/

public class Wepay {
    public boolean loginWechat(String weId,String pwd){
        if(pwd.equals("1234")){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean payment(double amount){
        if(amount>5000){
            return false;
        }
        else{
            return true;
        }
    }
}
