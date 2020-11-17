package specification.selector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * A Selector defined as the disjunction (OR) of other (leaf) selectors.
 */
public class DisjunctionSelector<T> extends AbstractSelector<T> {

    private final List<AbstractSelector<T>> leafComponents = new LinkedList<>();

    @SafeVarargs
    DisjunctionSelector(AbstractSelector<T>... selectors) {
        leafComponents.addAll(Arrays.asList(selectors));
    }

    /**
     * Tests if *at least one* selector passes the test.
     */
    @Override
    public boolean test(T t) {
        // todo something
        return leafComponents.stream().anyMatch(comp -> comp.test(t));
    }
}
