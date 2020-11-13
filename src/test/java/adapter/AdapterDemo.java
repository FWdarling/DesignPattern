package adapter;
import java.util.*;
/**
 * @Author Max Leung
 * @Description:A simple demp for the design pattern of adapter which integrate the different interface from Wepay and Alipay.
 * @Date: Created in 21:02 2020/11/12
 * @Modified By:
 **/
public class AdapterDemo {
    public void adapterTest(){
        System.out.println("----------------------------------------------------Adapter Test----------------------------------------------------\n");
        while(true) {
            System.out.println("请选择支付方式：1.支付宝 2.微信 3.退出\n");
            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();
            if (userOption == 1) {
                Alibaba alibaba = new Alibaba();
                int isBreak = 0;
                while (true) {
                    System.out.println("请输入您的账户以及密码\n账户:");
                    String id = scanner.next();
                    System.out.println("\n密码：");
                    String password = scanner.next();
                    System.out.println(password);
                    boolean loginStatus = alibaba.login(id, password);
                    if (loginStatus) {
                        System.out.println("\n登录成功！\n");
                        break;
                    } else {
                        System.out.println("登陆失败！\n");
                    }
                    System.out.println("重新输入账号密码，输入0\n想要退出登录请输入1\n");
                    isBreak = scanner.nextInt();
                    if (isBreak == 1) {
                        break;
                    }
                }
                if(isBreak==0){
                    int isPayAgain;
                    while(true) {
                        System.out.println("请输入支付金额：\n");
                        double amount = scanner.nextDouble();
                        boolean payStatus = alibaba.pay(amount);
                        if (payStatus) {
                            System.out.println("支付成功！\n");
                            break;
                        } else {
                            System.out.println("支付失败！单笔交易不能超过10000元！\n");
                        }
                        System.out.println("重新支付请输入0\n退出请输入1\n");
                        isPayAgain = scanner.nextInt();
                        if(isPayAgain==1){
                            break;
                        }
                    }
                }
                break;
            }
            else if (userOption == 2) {
                Wechat wechat = new Wechat();
                int isBreak = 0;
                while (true) {
                    System.out.println("请输入您的账户以及密码\n账户:");
                    String id = scanner.next();
                    System.out.println("\n密码：");
                    String password = scanner.next();
                    boolean loginStatus = wechat.login(id, password);
                    if (loginStatus) {
                        System.out.println("\n登录成功！\n");
                        break;
                    } else {
                        System.out.println("登陆失败！\n");
                    }
                    System.out.println("重新输入账号密码，输入0\n想要退出登录请输入1\n");
                    isBreak = scanner.nextInt();
                    if (isBreak == 1) {
                        break;
                    }
                }
                if(isBreak==0){
                    int isPayAgain;
                    while(true) {
                        System.out.println("请输入支付金额：\n");
                        double amount = scanner.nextDouble();
                        boolean payStatus = wechat.pay(amount);
                        if (payStatus) {
                            System.out.println("支付成功！\n");
                            break;
                        } else {
                            System.out.println("支付失败！单笔交易不能超过10000元！\n");
                        }
                        System.out.println("重新支付请输入0\n退出请输入1\n");
                        isPayAgain = scanner.nextInt();
                        if(isPayAgain==1){
                            break;
                        }
                    }
                }
                break;
            }
            else{
                break;
            }
        }
    }
}
