package adapter;
//import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

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
        int isBreak;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的账户以及密码\n账户:");
            String id = scanner.next();
            System.out.println("\n密码：");
            String password = scanner.next();
            System.out.println(password);
            Payment payer = payerRegistry.get(userOption-1);
            boolean loginStatus = payer.login(id, password);
            if (loginStatus) {
                System.out.println("\n登录成功！\n");
                return true;
            } else {
                System.out.println("登陆失败！\n");
            }
            System.out.println("重新输入账号密码，输入0\n想要退出登录请输入1\n");
            isBreak = scanner.nextInt();
            if (isBreak == 1) {
                return false;
            }
        }
    }

    private boolean transactionPay(int userOption){
        Scanner scanner = new Scanner(System.in);
        int isPayAgain;
        Payment payer = payerRegistry.get(userOption-1);
        while(true) {
            System.out.println("请输入支付金额：\n");
            double amount = scanner.nextDouble();
            boolean payStatus = payer.pay(amount);
            if (payStatus) {
                System.out.println("支付成功！\n");
                return true;
            } else {
                System.out.println("支付失败！单笔交易不能超过10000元！\n");
            }
            System.out.println("重新支付请输入0\n退出请输入1\n");
            isPayAgain = scanner.nextInt();
            if(isPayAgain==1){
                return false;
            }
        }
    }

    private boolean transaction(int userOption){
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("----------------------------------------------------Adapter Test----------------------------------------------------\n");
        System.out.println("请选择支付方式：1.支付宝 2.微信 3.退出\n");
        Scanner scanner = new Scanner(System.in);
        int userOption = scanner.nextInt();
        if (userOption == 3) {
            System.out.println("正在退出...");
        }
        else{
            boolean transactionStatus=transaction(userOption);
            if(transactionStatus==true){
                System.out.println("支付成功，正在退出...\n\n");
            }
        }
    }
}
