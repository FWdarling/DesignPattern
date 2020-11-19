package specification.selector;

import entity.Athlete;
import entity.Mass;

/**
 * Mass selector for values exactly equal than the parameter.
 */
public class MassEqualSelector extends AbstractSelector<Athlete> {

    private final Mass mass;

    /**
     * The use of a double as a parameter will spare some typing when instantiating this class.
     */
    public MassEqualSelector(double mass) {
        this.mass = new Mass(mass);
    }

    @Override
    public boolean test(Athlete t) {
        // todo add something
        return t.getMass().equals(mass);
    }
}
