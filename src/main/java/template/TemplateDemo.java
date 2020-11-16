package template;

import java.util.Scanner;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 13:21 2020/11/13
 * @Modified By:
 **/
public class TemplateDemo {
    public void templateTest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------Adapter Test----------------------------------------------------\n");
        System.out.println("运动会开幕式开始了！\n\n");
        BearOpenCeremony bearOpenCeremony = new BearOpenCeremony();
        BirdOpenCeremony birdOpenCeremony = new BirdOpenCeremony();
        ChickenOpenCeremony chickenOpenCeremony = new ChickenOpenCeremony();
        DogOpenCeremony dogOpenCeremony = new DogOpenCeremony();
        FishOpenCeremony fishOpenCeremony = new FishOpenCeremony();
        System.out.println("熊代表队：\n");
        bearOpenCeremony.openCeremonyProcess();
        System.out.println("\n");
        System.out.println("鸟代表队：\n");
        birdOpenCeremony.openCeremonyProcess();
        System.out.println("\n");
        System.out.println("狗代表队：\n");
        dogOpenCeremony.openCeremonyProcess();
        System.out.println("\n");
        System.out.println("鸡代表队：\n");
        chickenOpenCeremony.openCeremonyProcess();
        System.out.println("\n");
        System.out.println("鱼代表队：\n");
        fishOpenCeremony.openCeremonyProcess();
        System.out.println("\n");
        System.out.println("开幕式结束\n");
    }
}
