package visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:06
 * @Version: 1.0
 */
public class Perimeter implements Visitor{
    //Perimeter类是求elements的周长类，继承visitor

    //针对triangle的操作
    @Override
    public double ofShape(Triangle triangle) {
        double result = triangle.getEdgeA() + triangle.getEdgeB() + triangle.getEdgeC();
        System.out.println(triangle + "的面积："+result);
        return result;
    }
    //针对circle的操作
    @Override
    public double ofShape(Circle circle) {
        double result = circle.getRadius() * Math.PI * 2;
        System.out.println(circle + "的面积："+result);
        return result;
    }
    //针对square的操作
    @Override
    public double ofShape(Square square) {
        double result = square.getEdge() * 4;
        System.out.println(square + "的面积："+result);
        return result;
    }
}
