package cn.edu.tongji.team.test;
import cn.edu.tongji.team.patterns.businessdelegate.*;
import cn.edu.tongji.team.util.UI;

/**
 * description: BusinessDelegateTest
 * date: 12/4/20 10:40 PM
 * author: Ming
 */
public class businessdelegateTest {
    public static void main(String[] args) {
        //创建代理
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType(ServiceType.ChocolatePrice);

        //测试不同的业务服务
        System.out.println("           使用查询仓库中巧克力价格的服务：");
        Client client = new Client(businessDelegate);
        client.doTask();

        System.out.println("");
        System.out.println("           使用查询仓库中可可豆信息的服务：");
        businessDelegate.setServiceType(ServiceType.CocoaInfor);
        client.doTask();
        System.out.println("           " + UI.designPattern("业务代表模式"));
    }
}
