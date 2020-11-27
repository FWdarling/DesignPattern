package adapter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 20:34 2020/11/12
 * @Modified By:
 **/

public class Wepay {
    private double transactionLimits=5000;

    /**
     Get the limits of a single transaction which is platform-dependent.

     Args:

     Return:
        double
     **/
    public double getTransactionLimits(){
        return transactionLimits;
    }

    /**
     The login interface provided by the simulated Wepay.The function is to get the user's input and confirm the identity.

     Args:
     String weID:Account information
     String pwd:password information

     Return:
     boolean:whether the login is successful.
     **/
    public boolean loginWechat(String weId,String pwd){
        if(pwd.equals("1234")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     The interface to pay the bill provided by Wepay.

     Args:
     double amount: The amount of the bill

     Return:
     boolean:Whether the payment is successful.
     **/
    public boolean payment(double amount){
        if(amount>5000){
            return false;
        }
        else{
            return true;
        }
    }
}
