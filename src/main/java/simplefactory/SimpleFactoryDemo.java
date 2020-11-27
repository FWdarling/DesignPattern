package simplefactory;

import simplefactory.entity.IceCream;
import simplefactory.entity.IceCreamStaff;

import java.util.Vector;

/**
 * 简单工厂 Demo类
 */
public class SimpleFactoryDemo {
    /**
     * 运行简单工厂 Demo
     * 向员工获取冰淇淋，保存下来。
     */
    public static void runSimpleFactoryDemo(){
        Vector<IceCream> myIceCream=new Vector<IceCream>();

        System.out.println("                                        [ IceCreamStaff : getIceCream(String ICName) : 冰淇淋店员制造（售卖）指定冰淇淋 ]");

        System.out.println("买香草冰淇淋");
        myIceCream.add(IceCreamStaff.getIceCream("香草冰淇淋"));
        System.out.println("买巧克力冰淇淋");
        myIceCream.add(IceCreamStaff.getIceCream("巧克力冰淇淋"));
        System.out.println("买抹茶冰淇淋");
        myIceCream.add(IceCreamStaff.getIceCream("抹茶冰淇淋"));

        for(IceCream ic : myIceCream){
            System.out.println("得到了一个"+ic.getName());
        }
    }
}
