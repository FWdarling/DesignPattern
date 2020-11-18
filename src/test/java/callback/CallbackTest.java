package callback;

import org.junit.Test;
/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:26 2020/11/16
 * @Modified By:
 **/
public class CallbackTest {

    @Test
    public void callbackTest(){
        System.out.println("========  测试回调模式开始  ========");
        CallbackDemo.callbackTest();
        System.out.println("========  测试回调模式结束  ========");
    }
}
