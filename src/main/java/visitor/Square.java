package visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:06
 * @Version: 1.0
 */
public class Square implements Element{
    private double edge; //square 四边相等

    //初始化
    public Square(double edge) {
        this.edge = edge;
    }
    //获得正方形边长
    public double getEdge() {
        return edge;
    }

    // 方法接受策略对象为参数，方法内将自身作为参数再传给策略的方法
    @Override
    public double accept(Visitor visitor) {
        return visitor.ofShape(this);
    }
}
