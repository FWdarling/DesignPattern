package main.Visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:02
 * @Version: 1.0
 */
public interface Visitor {
    double ofShape(Triangle triangle);
    double ofShape(Circle circle);
    double ofShape(Square square);
}
