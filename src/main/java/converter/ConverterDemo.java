package converter;

import java.util.*;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 12:27 2020/11/13
 * @Modified By:
 **/
public class ConverterDemo {
    public void converterTest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------Adapter Test----------------------------------------------------\n");
        System.out.println("欢迎来到货币兑换区域！\n");
        System.out.println("请输入您所持有的货币： 1.EUR 2.USD 3.GBP\n");
        int concurrencyType=scanner.nextInt();
        System.out.println("请输入您要兑换的金额（原货币）：\n");
        double amount=scanner.nextDouble();
        if(concurrencyType==1){
            EUR eur=new EUR();
            double rmb=eur.toRMB(amount);
            System.out.println("您兑换得到"+rmb+"人民币");
        }
        else if(concurrencyType==2){
            USD usd=new USD();
            double rmb=usd.toRMB(amount);
            System.out.println("您兑换得到"+rmb+"人民币");
        }
        else{
            GBP gbp=new GBP();
            double rmb=gbp.toRMB(amount);
            System.out.println("您兑换得到"+rmb+"人民币");
        }
        System.out.println("\n\n");
        System.out.println("按c键+Enter键继续...\n");
        scanner.next();
        System.out.println("欢迎来到结算区域：\n");
        System.out.println("请输入您卡中的货币类型：1.EUR 2.USD 3.GBP\n");
        concurrencyType=scanner.nextInt();
        System.out.println("请输入您本次结算的总金额：\n");
        amount=scanner.nextDouble();
        if(concurrencyType==1){
            EUR eur=new EUR();
            double eurCost=eur.fromRMB(amount);
            System.out.println("您支付了"+eurCost+"EUD");
        }
        else if(concurrencyType==2){
            USD usd=new USD();
            double usdCost=usd.fromRMB(amount);
            System.out.println("您支付了"+usdCost+"USD");
        }
        else{
            GBP gbp=new GBP();
            double gbpCost=gbp.toRMB(amount);
            System.out.println("您支付了"+gbpCost+"GBP");
        }
        System.out.println("\n\n");
    }
}
