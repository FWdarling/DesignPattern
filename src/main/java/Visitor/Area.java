package main.visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:07
 * @Version: 1.0
 */
public class Area implements Visitor{
    //Area类是求elements的周长类，继承visitor

    @Override
    public double ofShape(Triangle triangle) {
        double a = triangle.getEdgeA(), b = triangle.getEdgeB(), c = triangle.getEdgeC();
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) *  (p - b) * (p - c));
    }

    @Override
    public double ofShape(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public double ofShape(Square square) {
        return Math.pow(square.getEdge(), 2);
    }
}
