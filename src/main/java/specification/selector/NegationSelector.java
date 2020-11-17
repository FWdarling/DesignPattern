package specification.selector;

/**
 * A Selector defined as the negation (NOT) of a (leaf) selectors. This is of course only useful
 * when used in combination with other composite selectors.
 */
public class NegationSelector<T> extends AbstractSelector<T> {

    private final AbstractSelector<T> component;

    NegationSelector(AbstractSelector<T> selector) {
        this.component = selector;
    }

    /**
     * Tests if the selector fails the test (yes).
     */
    @Override
    public boolean test(T t) {
        // todo add something
        return !(component.test(t));
    }
}
