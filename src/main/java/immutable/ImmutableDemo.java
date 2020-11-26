package immutable;

import entity.Material;
import entity.Medal;

/**
 * description: Immutable模式调用类
 * date: 11/24/20 02:04 AM
 * author: cjsmt
 */
public class ImmutableDemo {
    public static void immutableTest() throws InterruptedException{
        /**
         * 以下测试用于证明同一medal实例可以在不同进程中同时存在不互斥
         */
        Medal swimmingGold = new Medal(Material.Gold, "Swimming");
        PrintMedalThread sg1 = new PrintMedalThread(swimmingGold);
        PrintMedalThread sg2 = new PrintMedalThread(swimmingGold);
        System.out.println("                                        [ PrintMedalThread : run() : 打印当前线程名字，及线程中使用的medal ]");
        sg1.start();    sg2.start();
        sg1.join();     sg2.join();
        Medal basketballSilver = new Medal(Material.Silver, "Basketball");
        PrintMedalThread bs1 = new PrintMedalThread(basketballSilver);
        PrintMedalThread bs2 = new PrintMedalThread(basketballSilver);
        System.out.println("                                        [ PrintMedalThread : run() : 打印当前线程名字，及线程中使用的medal ]");
        bs1.start();    bs2.start();
        bs1.join();     bs2.join();
    }
}
