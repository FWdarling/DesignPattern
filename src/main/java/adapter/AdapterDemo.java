package adapter;
import java.util.*;
/**
 * @Author Max Leung
 * @Description:A simple demp for the design pattern of adapter which integrate the different interface from Wepay and Alipay.
 * @Date: Created in 21:02 2020/11/12
 * @Modified By:
 **/
public class AdapterDemo {
    /**
     In the system, we may have lots of methods of paying. However the process of paying for all kinds of methods are
     similar to each other, instead of implement a paying process for each methods, we add all paying methods into an
     registry which is a array list storing an instance for all methods, every time when a kind of method is invoked, an
     instance can be fetched directly from the array list.
     **/
    private ArrayList<Payment> payerRegistry=new ArrayList<Payment>();

    public AdapterDemo(){
        Alibaba alibaba = new Alibaba();
        Wechat wechat = new Wechat();
        payerRegistry.add(alibaba);
        payerRegistry.add(wechat);
    }

    private boolean transactionLogin(int userOption) {

        System.out.println("                                        " +
                "[ payerRegistry : get() : 从支付方式链表中获取一个支付方法实例 ]");
        Payment payer = payerRegistry.get(userOption-1);
        System.out.println("                                        " +
                "[ Payment : login() : 登录相对应的系统 ]");
        boolean loginStatus = payer.login("test1","4567");
        if(loginStatus==false){
            System.out.println("账号：test1,密码：4567 登陆失败！\n");
        }
        else{
            System.out.println("账号：test1,密码：4567 登陆成功！\n");
        }

        System.out.println("                                        " +
                "[ Payment : login() : 登录相对应的系统 ]");
        loginStatus=payer.login("test2","1234");
        if(loginStatus==false){
            System.out.println("账号：test2,密码：1234 登陆失败！\n");
        }
        else {
            System.out.println("账号：test2,密码：1234 登陆成功！\n");
        }

        return loginStatus;
    }

    private boolean transactionPay(int userOption){
        System.out.println("                                        " +
                "[ payerRegistry : get() : 从支付方法队列中获取一个支付方法实例 ]");
        Payment payer = payerRegistry.get(userOption-1);

        System.out.println("                                        " +
                "[ Payment : pay() : 调用相对应系统的支付功能 ]");
        System.out.println("支付100000元！\n");
        boolean payStatus = payer.pay(100000);
        if (payStatus) {
            System.out.println("支付成功！\n");
            return true;
        } else {
            System.out.println("支付失败！单笔交易不能超过"+payer.getLimits()+"元！\n");
        }
        System.out.println("                                        " +
                "[ Payment : pay() : 调用相对应系统的支付功能 ]");
        payStatus = payer.pay(100);

        System.out.println("支付100元！\n");
        if (payStatus) {
            System.out.println("支付成功！\n");
            return true;
        } else {
            System.out.println("支付失败！单笔交易不能超过"+payer.getLimits()+"元！\n");
        }
        return payStatus;
    }

    private boolean transaction(int userOption){
        boolean loginStatus=transactionLogin(userOption);

        if(loginStatus==false){
            System.out.println("登陆失败，正在退出...\n\n");
            return false;
        }

        boolean payStatus=transactionPay(userOption);
        if(payStatus==false){
            System.out.println("支付失败，正在退出...\n\n");
            return false;
        }
        return true;
    }

    public void adapterTest(){

        System.out.println("Alipay:\n");
        transaction(1);

        System.out.println("Wepay:\n");
        transaction(2);
    }
}
