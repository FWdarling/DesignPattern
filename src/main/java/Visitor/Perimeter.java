package visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:06
 * @Version: 1.0
 */
public class Perimeter implements Visitor{
    //Perimeter类是求elements的周长类，继承visitor

    @Override
    public double ofShape(Triangle triangle) {
        return triangle.getEdgeA() + triangle.getEdgeB() + triangle.getEdgeC();
    }
    @Override
    public double ofShape(Circle circle) {
        return circle.getRadius() * Math.PI * 2;
    }
    @Override
    public double ofShape(Square square) {
        return square.getEdge() * 4;
    }
}
