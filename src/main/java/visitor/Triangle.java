package visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:02
 * @Version: 1.0
 */
public class Triangle implements Element {
    private double edgeA;
    private double edgeB;
    private double edgeC;
    //三角形初始化
    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }
    //获得A边长
    public double getEdgeA() {
        return edgeA;
    }
    //获得B边长
    public double getEdgeB() {
        return edgeB;
    }
    //获得C边长
    public double getEdgeC() {
        return edgeC;
    }


    // 方法接受策略对象为参数，方法内将自身作为参数再传给策略的方法
    @Override
    public double accept(Visitor visitor) {
        return visitor.ofShape(this);
    }
}
