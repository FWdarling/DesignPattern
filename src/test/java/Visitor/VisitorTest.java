package test.visitor;

import main.visitor.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:51
 * @Version: 1.0
 */
public class VisitorTest {
    @Test
    public void test(){
        System.out.println("====Visitor===");
        System.out.println("利用visitor模式为多个类提供多种方法");
        System.out.println("此时有4座形状不同的建筑物，求出他们的周长和面积");

        // 一个含有5个元素的List，包含三种不同的形状
        List<Element> shapes = new ArrayList<Element>();
        shapes.add(new Triangle(1.3, 2.2, 3.1));
        shapes.add(new Circle(1.2));
        shapes.add(new Triangle(2.4, 3.3, 4.2));
        //shapes.add(new Rectangle(2.1, 3.2));
        shapes.add(new Circle(5.6));

        // 计算周长和面积的不同策略（访问者）
        Perimeter perimeter = new Perimeter();
        Area area = new Area();

        // 将周长和面积的计算策略传入（接受不同访问者的访问）
        for (Element shape : shapes) {
            System.out.printf("周长 : %5.2f\t 面积 : %5.2f\n", shape.accept(perimeter), shape.accept(area));
        }
    }

}
