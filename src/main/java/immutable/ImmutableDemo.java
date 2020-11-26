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
        /**
         * 以下测试用于证明同一medal实例可以在不同进程中同时存在不互斥
         */
        Medal swimmingGold = new Medal(Material.Gold, "Swimming");
        new PrintMedalThread(swimmingGold).start();
        new PrintMedalThread(swimmingGold).start();
        new PrintMedalThread(swimmingGold).start();
        Medal basketballSilver = new Medal(Material.Silver, "Basketball");
        new PrintMedalThread(basketballSilver).start();
        new PrintMedalThread(basketballSilver).start();
        new PrintMedalThread(basketballSilver).start();
    }
}
