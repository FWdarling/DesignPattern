package cn.edu.tongji.team.patterns.builder;

import cn.edu.tongji.team.model.beans.chocolate.ChocolateType;
import cn.edu.tongji.team.model.beans.chocolate.Hershey;
import cn.edu.tongji.team.model.giftbox.Present;
import cn.edu.tongji.team.model.realfactory.RealFactory;
import cn.edu.tongji.team.patterns.builder.chocofactorybuilder.FactoryDirector;
import cn.edu.tongji.team.patterns.builder.chocofactorybuilder.SmallFactoryBuilder;
import cn.edu.tongji.team.patterns.builder.giftboxbuilder.GiftBoxBuilder;
import org.junit.Test;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/12/4,19:34
 * Version: 1.0
 */
public class BuilderTest {
    @Test
    public void Test(){

        //测试注：改代码仅仅按照源代码中的可运行代码进行编写，但本质上该代码并没有体现builder pattern的架构，只有一个单纯的线性继承体系，缺乏“产品类”和多个具体建造者。

        SmallFactoryBuilder smallFactoryBuilder = new SmallFactoryBuilder();
        FactoryDirector factoryDirector = new FactoryDirector(smallFactoryBuilder);
        RealFactory realFactory = factoryDirector.buildFactory();


        GiftBoxBuilder giftBoxBuilder = new GiftBoxBuilder();



        giftBoxBuilder.setName("好时中秋锦鲤礼盒 - 月中方折桂；流光入杯，诸事顺遂。");
        for(int i = 0; i < 5; i++){
            giftBoxBuilder.addChocolate(new Hershey(ChocolateType.Deluxe));
        }
        for(int i = 0; i < 10; i++){
            giftBoxBuilder.addChocolate(new Hershey(ChocolateType.Premium));
        }
        for(int i = 0; i < 20; i++){
            giftBoxBuilder.addChocolate(new Hershey(ChocolateType.Ordinary));
        }

        giftBoxBuilder.addPresent(new Present("杯子"));
        giftBoxBuilder.addPresent(new Present("杯子"));
        giftBoxBuilder.addPresent(new Present("卡片"));
        giftBoxBuilder.addPresent(new Present("卡片"));

        giftBoxBuilder.addPresent(new Present("奶茶"));
        giftBoxBuilder.addPresent(new Present("奶茶"));
        giftBoxBuilder.addPresent(new Present("盒子"));
        giftBoxBuilder.addPresent(new Present("盒子"));

        giftBoxBuilder.toGiftBox().displayDetail();
    }
}
