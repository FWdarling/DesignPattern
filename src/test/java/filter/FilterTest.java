package filter;

import org.junit.Test;

/**
 * description: 过滤器模式测试类
 * date: 11/12/20 12:42 AM
 * author: fourwood
 */
public class FilterTest {

    @Test
    public void filterTest() {
        System.out.println("---------------- [Pattern] Filter ----------------");
        DishesFilterDemo.dishesFilterTest();
        System.out.println("------------------------ END ------------------------");
    }
}
