package cn.edu.tongji.team.patterns.frontcontroller;

import org.junit.Test;

/**
 * description: DependencyInjectionTest
 * date: 12/4
 * author: Li
 */

//这个是监控室，可以通过request查看不同的场景的监控
public class FrontControllerTest {

    @Test
    public void FrontControllerTest()
    {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("车间");
        frontController.dispatchRequest("办公室");
    }

}
