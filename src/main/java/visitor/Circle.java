package visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:06
 * @Version: 1.0
 */
public class Circle implements Element {
    private double radius;

    //初始化
    public Circle(double radius) {
        this.radius = radius;
    }

    //获得当前圆形的半径
    public double getRadius() {
        return radius;
    }

    // 方法接受策略对象为参数，方法内将自身作为参数再传给策略的方法
    @Override
    public double accept(Visitor visitor) {
        return visitor.ofShape(this);
    }
}
