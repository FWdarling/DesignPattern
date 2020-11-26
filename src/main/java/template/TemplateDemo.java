package template;

import java.util.Scanner;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:21 2020/11/13
 * @Modified By:
 **/
public class TemplateDemo {
    public static void templateTest(){
        System.out.println("运动会开幕式开始了！\n\n");
        BearOpenCeremony bearOpenCeremony = new BearOpenCeremony();
        BirdOpenCeremony birdOpenCeremony = new BirdOpenCeremony();
        ChickenOpenCeremony chickenOpenCeremony = new ChickenOpenCeremony();
        DogOpenCeremony dogOpenCeremony = new DogOpenCeremony();
        FishOpenCeremony fishOpenCeremony = new FishOpenCeremony();

        System.out.println("                                        " +
                "[ BearOpenCeremony : openCeremonyProcess() : 调用熊的开幕式过程 ]");
        System.out.println("熊代表队：\n");
        bearOpenCeremony.openCeremonyProcess();
        System.out.println("\n");

        System.out.println("                                        " +
                "[ BirdOpenCeremony : openCeremonyProcess() : 调用鸟的开幕式过程 ]");
        System.out.println("鸟代表队：\n");
        birdOpenCeremony.openCeremonyProcess();
        System.out.println("\n");

        System.out.println("                                        " +
                "[ dogOpenCeremony : openCeremonyProcess() : 调用狗的开幕式过程 ]");
        System.out.println("狗代表队：\n");
        dogOpenCeremony.openCeremonyProcess();
        System.out.println("\n");

        System.out.println("                                        " +
                "[ ChickenOpenCeremony : openCeremonyProcess() : 调用鸡的开幕式过程 ]");
        System.out.println("鸡代表队：\n");
        chickenOpenCeremony.openCeremonyProcess();
        System.out.println("\n");

        System.out.println("                                        " +
                "[ FishOpenCeremony : openCeremonyProcess() : 调用鱼的开幕式过程 ]");
        System.out.println("鱼代表队：\n");
        fishOpenCeremony.openCeremonyProcess();
        System.out.println("\n");


        System.out.println("开幕式结束\n");
    }
}
