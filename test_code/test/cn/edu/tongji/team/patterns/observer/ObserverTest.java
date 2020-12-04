package observer;

import cn.edu.tongji.team.patterns.observer.ChocolateObserver;
import cn.edu.tongji.team.patterns.observer.IngredientObserver;
import cn.edu.tongji.team.patterns.observer.MarketPriceFluctuation;
import org.junit.Test;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 16:46 2020/12/3
 * @Modified By:
 **/
public class ObserverTest {
    @Test
    public void observerTest(){
        MarketPriceFluctuation marketPriceFluctuation = new MarketPriceFluctuation();
        ChocolateObserver chocolateObserver = new ChocolateObserver();
        IngredientObserver ingredientObserver = new IngredientObserver();
        marketPriceFluctuation.addObserver(chocolateObserver);
        marketPriceFluctuation.addObserver(ingredientObserver);

        System.out.println("测试观察者模式！\n");
        marketPriceFluctuation.updateGrowthRate();
    }
}
