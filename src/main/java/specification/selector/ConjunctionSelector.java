package specification.selector;

import java.util.List;

/**
 * A Selector defined as the conjunction (AND) of other (leaf) selectors.
 */
public class ConjunctionSelector<T> extends AbstractSelector<T> {

    private final List<AbstractSelector<T>> leafComponents;

    @SafeVarargs
    ConjunctionSelector(AbstractSelector<T>... selectors) {
        this.leafComponents = List.of(selectors);
    }

    /**
     * Tests if *all* selectors pass the test.
     */
    @Override
    public boolean test(T t) {
        boolean result = leafComponents.stream().allMatch(comp -> (comp.test(t)));
        if(result) {
            System.out.println("All check passed, this athlete is qualified.");
        }
        else {
            System.out.println("Some check failed, this athlete is not qualified.");
        }
        return result;
    }
}
