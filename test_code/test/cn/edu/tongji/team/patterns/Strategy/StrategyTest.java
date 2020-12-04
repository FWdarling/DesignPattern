package cn.edu.tongji.team.test;

import cn.edu.tongji.team.model.beans.chocolate.ChocolateType;
import cn.edu.tongji.team.patterns.strategy.DoveFactoryStrategy;
import cn.edu.tongji.team.patterns.strategy.FerreroFactoryStrategy;
import cn.edu.tongji.team.patterns.strategy.HersheyFactoryStrategy;
import cn.edu.tongji.team.patterns.strategy.StartegyContext;

import java.util.Scanner;

public class StrategyTest {
    public static void main(String[] args) {
        StartegyContext context = new StartegyContext();
        //选择巧克力工厂
        System.out.println("选择将要创建的抽象工厂：1、德芙 2、费列罗 3、好时");
        System.out.print("输入你的选择:");
        Scanner input = new Scanner(System.in);//读入用户选择
        int startegyFactory = input.nextInt();
        //判断用户选择正确与否
        boolean flag = true;
        while (flag) {
            flag=false;
            switch (startegyFactory) {
                case 1:
                    context.setStrategy(new DoveFactoryStrategy());
                    break;
                case 2:
                    context.setStrategy(new FerreroFactoryStrategy());
                    break;
                case 3:
                    context.setStrategy(new HersheyFactoryStrategy());
                    break;
                default:
                    System.out.print("错误的选择，清重新输入:");
                    startegyFactory = input.nextInt();
                    flag=true;
            }
        }
        //选择巧克力类别
        System.out.println("------------------------------------------");
        System.out.println("选择将要生产的巧克力的类别：1、普通 2、高级 3、豪华");
        System.out.print("输入你的选择:");
        Scanner inputType = new Scanner(System.in);//读入用户选择
        int startegyType = inputType.nextInt();
        //判断用户选择正确与否
        flag=true;
        while (flag) {
            flag=false;
            switch (startegyType) {
                case 1:
                    context.executeStrategy(ChocolateType.Ordinary);
                    break;
                case 2:
                    context.executeStrategy(ChocolateType.Premium);
                    break;
                case 3:
                    context.executeStrategy(ChocolateType.Deluxe);
                    break;
                default:
                    System.out.print("错误的选择，清重新输入:");
                    startegyType = inputType.nextInt();
                    flag=true;
            }
        }}
}
