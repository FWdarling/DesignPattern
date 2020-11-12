package main.Visitor;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:07
 * @Version: 1.0
 */
public interface Element {
    double accept(Visitor visitor);
}
