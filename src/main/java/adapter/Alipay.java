package adapter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 20:35 2020/11/12
 * @Modified By:
 **/

public class Alipay {
    private double limits=10000;

    /**
     Get the limits of a single transaction which is platform-dependent.

     Args:

     Return:
     double
     **/
    public double getLimitAmount(){
        return limits;
    }

    /**
     The login interface provided by the simulated Alipay.The function is to get the user's input and confirm the identity.

     Args:
        String aliAccount:Account information
        String password:password information

     Return:
        boolean:whether the login is successful.
     **/
    public boolean validation(String aliAccount,String password){
        if(password.equals("1234")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     The interface to pay the bill provided by Alipay.

     Args:
        String aliAccount: User's Account
        double amount: The amount of the bill

     Return:
        boolean:Whether the payment is successful.
     **/
    public boolean payBill(String aliAccount,double amount){
        if(amount>10000){
            return false;
        }
        else{
            return true;
        }
    }

}
