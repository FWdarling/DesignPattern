package immutable;

import entity.Material;
import entity.Medal;

/**
 * description: Immutable模式调用类
 * date: 11/24/20 02:04 AM
 * author: cjsmt
 */
public class ImmutableDemo {
    public static void immutableTest(){
        Medal swimmingGold = new Medal(Material.Gold, "Swimming");
        Medal basketballSilver = new Medal(Material.Silver, "Basketball");
        new PrintMedalThread(swimmingGold).start();
        new PrintMedalThread(swimmingGold).start();
        new PrintMedalThread(swimmingGold).start();
        new PrintMedalThread(basketballSilver).start();
        new PrintMedalThread(basketballSilver).start();
        new PrintMedalThread(basketballSilver).start();
    }
}
