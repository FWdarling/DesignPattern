package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/26,11:35
 * Version: 1.0
 */
public class VisitorDemo {
    public static void VisitTest(){
            System.out.println("利用visitor模式为多个类提供多种方法");
            System.out.println("OlympicsYard需要扩建，新修4座形状不同的建筑物，现要求求出他们的周长和面积");

            // 一个含有5个元素的List，包含三种不同的形状
            ObjectStructure shapes = new ObjectStructure();
            System.out.println("                                        [ ObjectStructure : add() : 将该元素装入对象容器内 ]");
            System.out.println("Triangle 1, edges = (1.3,2.2,3.1)");
            shapes.add(new Triangle(1.3, 2.2, 3.1));
            System.out.println("                                        [ ObjectStructure : add() : 将该元素装入对象容器内 ]");
            System.out.println("Circle 1, radius = (1.2)");
            shapes.add(new Circle(1.2));
            System.out.println("                                        [ ObjectStructure : add() : 将该元素装入对象容器内 ]");
            System.out.println("Triangle 2, edges = (2.4,3.3,4.2)");
            shapes.add(new Triangle(2.4, 3.3, 4.2));
            System.out.println("                                        [ ObjectStructure : add() : 将该元素装入对象容器内 ]");
            System.out.println("Circle, radius = (5.6)");
            shapes.add(new Circle(5.6));

            // 计算周长和面积的不同策略（访问者）
            Perimeter perimeter = new Perimeter();
            Area area = new Area();

            // 将周长和面积的计算策略传入（接受不同访问者的访问）
            System.out.println("                                        [ ObjectStructure : accept() : 接受具体的操作方法类-perimeter ]");
            shapes.accept(perimeter);
            System.out.println("                                        [ ObjectStructure : accept() : 接受具体的操作方法类-area ]");
            shapes.accept(area);
    }
}
