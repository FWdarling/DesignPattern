package visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:07
 * @Version: 1.0
 */
public interface Element {
    public abstract double accept(Visitor visitor);
}
