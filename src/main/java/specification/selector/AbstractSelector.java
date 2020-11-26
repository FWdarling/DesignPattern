package specification.selector;

import java.util.function.Predicate;

/**
 * 选择器的基类
 * and，or，not 都是模板
 */
public abstract class AbstractSelector<T> implements Predicate<T> {

    /**
     * 与运算
     * @param other AbstractSelector<T>
     * @return AbstractSelector<T>
     */
    public AbstractSelector<T> and(AbstractSelector<T> other) {
        return new ConjunctionSelector<>(this, other);
    }

    /**
     * 或运算
     * @param other AbstractSelector<T>
     * @return AbstractSelector<T>
     */
    public AbstractSelector<T> or(AbstractSelector<T> other) {
        return new DisjunctionSelector<>(this, other);
    }

    /**
     * 非运算
     * @return AbstractSelector<T>
     */
    public AbstractSelector<T> not() {
        return new NegationSelector<>(this);
    }
}
