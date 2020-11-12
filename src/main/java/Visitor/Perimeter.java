package main.Visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:06
 * @Version: 1.0
 */
public class Perimeter implements Visitor{
    public double ofShape(Triangle triangle) {
        return triangle.getEdgeA() + triangle.getEdgeB() + triangle.getEdgeC();
    }

    public double ofShape(Circle circle) {
        return circle.getRadius() * Math.PI * 2;
    }

    public double ofShape(Square square) {
        return square.getEdge() * 4;
    }
}
