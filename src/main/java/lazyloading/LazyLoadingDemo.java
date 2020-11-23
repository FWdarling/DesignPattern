package lazyloading;

import java.util.ArrayList;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:21 2020/11/23
 * @Modified By:
 **/
public class LazyLoadingDemo {
    public static void lazyLoadingTest(){
        System.out.println("动物运动会官方工作人员信息公布：\n");
        StuffInfoListProxy stuffInfoListProxy=new StuffInfoListProxy();
        ArrayList<Stuff> stuffList=stuffInfoListProxy.getStuffList();
        for (Stuff stuff:stuffList){
            System.out.println(stuff);
        }
    }
}
