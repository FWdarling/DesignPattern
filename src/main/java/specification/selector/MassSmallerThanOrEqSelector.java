package specification.selector;

import entity.Athlete;
import entity.Mass;

/**
 * Mass selector for values smaller or equal to the parameter.
 */
public class MassSmallerThanOrEqSelector extends AbstractSelector<Athlete> {

    private final Mass mass;

    /**
     * The use of a double as a parameter will spare some typing when instantiating this class.
     */
    public MassSmallerThanOrEqSelector(double mass) {
        this.mass = new Mass(mass);
    }

    /**
     * 规约：体重小于等于
     * @param t Athlete
     * @return boolean
     */
    @Override
    public boolean test(Athlete t) {
        // todo add something
        return t.getMass().smallerThanOrEq(mass);
    }
}
