package cn.edu.tongji.team.test;

import cn.edu.tongji.team.model.beans.cocoa.*;

import java.lang.reflect.Field;

public class TemplateMethodTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //处理不同种类的可可豆
        Cocoa cocoa1 = new ImpureCocoa(CocoaBeansType.AmericanCocoa);
        cocoa1.processCocoa();

        System.out.println("------------------------------");

        Cocoa cocoa2 = new WetCocoa(CocoaBeansType.AfricanCocoa);
        cocoa2.processCocoa();

        System.out.println("------------------------------");

        Cocoa cocoa3 = new MouldyCocoa(CocoaBeansType.AsianCocoa);
        cocoa3.processCocoa();
        cocoa3 = new MouldyCocoa(CocoaBeansType.AmericanCocoa);
        cocoa3.processCocoa();

        System.out.println("------------------------------");

        Class clazz = Cocoa.class;
        Field cocoaType = clazz.getDeclaredField("type");
        cocoaType.setAccessible(true);

        Cocoa cocoa4 = new NullCocoa();
        cocoa4.processCocoa();
        System.out.println("cocoa type:" + cocoaType.get(cocoa4));
        cocoa4.setType(CocoaBeansType.AfricanCocoa);
        cocoa4.processCocoa();
        System.out.println("cocoa type:" + cocoaType.get(cocoa4));

    }
}
