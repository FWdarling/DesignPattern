package adapter;

import org.junit.Test;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:32 2020/11/16
 * @Modified By:
 **/
public class AdapterTest {

    @Test
    public void adapterTest(){
        System.out.println("---------------- [Pattern] Adapter----------------");
        AdapterDemo adapterDemo = new AdapterDemo();
        adapterDemo.adapterTest();
        System.out.println("------------------------ END ------------------------");
    }
}
