package adapter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 20:49 2020/11/12
 * @Modified By:
 **/
public class Wechat extends Wepay implements Payment {

    private String id;
    private boolean loginStatus = false;

    /**
     Pay is a universal function in this interface to accomplish the final stage of payment which transfer money from user
     to the sellers via different platforms such as Alipay and Wepay. Such platforms vary on the interfaces that are exposed
     to the public with different arguments and function name.

     However, in the payment interface, all interfaces related to the final stage of transferring money are intgrated and
     serve in a same way.Simply call the pay function and the platform-dependent procedure will be accomplished.

     Args:
     amount: The amount of the bill to be paid which is a double number.

     return value:
     true: payment is done.
     false：Failure occured during payment.

     Examples:
     >>Payment payment=new Payment();
     >>payment.pay(12.34);
     **/
    @Override
    public boolean pay(double amount) {
        boolean payStatus = payment(amount);
        return payStatus;
    }

    /**
     login is an integrated interface to log into different platform so that the payment could be accomplished.

     Args:
     id： user's account for the chosen platform.
     password: password for the platform.

     Return value:
     true: login succeeds.
     false：login fails.

     Examples:
     >>Payment payment=new Payment();
     >>payment.login("abcd","1234");
     **/
    @Override
    public boolean login(String id,String password){
        this.id=id;
        this.loginStatus=loginWechat(id,password);
        return this.loginStatus;
    }

    /**
     The amount of a single transaction is restricted by the paying platform.The platform provides a interface to
     imform the users of the limits.

     Args:

     Return Values:
     double: The exact amounts of the restriction.

     Examples:
     >>Payment payment=new Payment();
     >>double limits=payment.getLimits();

     **/
    @Override
    public double getLimits(){
        return getTransactionLimits();
    }
}
