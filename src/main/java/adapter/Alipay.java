package adapter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 20:35 2020/11/12
 * @Modified By:
 **/

public class Alipay {
    public boolean validation(String aliAcount,String password){
        if(password.equals("1234")){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean payBill(String aliAccount,double amount){
        if(amount>10000){
            return false;
        }
        else{
            return true;
        }
    }
}
