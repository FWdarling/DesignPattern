package cn.edu.tongji.team.test.facade;

import cn.edu.tongji.team.patterns.facade.ProductionFacade;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void FacadeTest() {
        ProductionFacade productionFacade = new ProductionFacade();

        System.out.println("结束生产：");
        productionFacade.stopProduction(); // 结束生产
        System.out.println();

        System.out.println("开始生产：");
        productionFacade.startProduction(); // 开始生产
        System.out.println();

        System.out.println("准备阶段：");
        productionFacade.prepare(); // 准备阶段
        System.out.println();
    }

}
