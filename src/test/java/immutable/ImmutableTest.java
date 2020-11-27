package immutable;

import org.junit.Test;

/**
 * description: Immutable模式测试类
 * date: 11/24/20 02:03 AM
 * author: cjsmt
 */
public class ImmutableTest {

    @Test
    public void immutableTest(){
        System.out.println("---------------- [Pattern] Immutable ----------------");
        try {
            ImmutableDemo.immutableTest();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------ END ------------------------");
    }
}
