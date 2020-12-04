package visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:07
 * @Version: 1.0
 */
public class Area implements Visitor{
    //Area类是求elements的周长类，继承visitor

    @Override
    //针对triangle的操作
    public double ofShape(Triangle triangle) {
        double a = triangle.getEdgeA(), b = triangle.getEdgeB(), c = triangle.getEdgeC();
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) *  (p - b) * (p - c));
        System.out.println(triangle + "的周长："+result);
        return result;
    }
    //针对circle的操作
    @Override
    public double ofShape(Circle circle) {
        double result = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println(circle + "的周长："+result);
        return result;
    }
    //针对square的操作
    @Override
    public double ofShape(Square square) {
        double result =  Math.pow(square.getEdge(), 2);
        System.out.println(square + "的周长："+result);
        return result;
    }
}
