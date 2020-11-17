package visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:02
 * @Version: 1.0
 */
public interface Visitor {
    //ofShape表示提供对某种性质的集合图像的操作，具体操作根据实现Visitor操作的Class决定。
    //例如：Perimeter.ofShape(Triangle trangle),表示求该三角形的周长。

    //提供对于triangle的操作
    public abstract double ofShape(Triangle triangle);

    //提供对于circle的操作
    public abstract double ofShape(Circle circle);

    //提供对于square的操作
    public abstract double ofShape(Square square);
}
