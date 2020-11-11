package filter;

import flyweight.FlyWeightDemo;
import org.junit.Test;

/**
 * description: 过滤器模式测试类
 * date: 11/12/20 12:42 AM
 * author: fourwood
 */
public class FilterTest {

    @Test
    public void filterTest() {
        System.out.println("========  测试过滤器模式开始  ========");
        DishesFilterDemo.dishesFilterTest();
        System.out.println("========  测试过滤器模式结束  ========");
    }
}
