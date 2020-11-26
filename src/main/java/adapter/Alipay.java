package adapter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 20:35 2020/11/12
 * @Modified By:
 **/

public class Alipay {
    private double limits=10000;

    public double getLimitAmount(){
        return limits;
    }

    public boolean validation(String aliAccount,String password){
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
