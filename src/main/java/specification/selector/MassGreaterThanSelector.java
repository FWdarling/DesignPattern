package specification.selector;

import specification.entity.Athlete;
import specification.property.Mass;

/**
 * Mass selector for values greater than the parameter.
 */
public class MassGreaterThanSelector extends AbstractSelector<Athlete> {

    private final Mass mass;

    /**
     * The use of a double as a parameter will spare some typing when instantiating this class.
     */
    public MassGreaterThanSelector(double mass) {
        this.mass = new Mass(mass);
    }

    @Override
    public boolean test(Athlete t) {
        boolean result = t.getMass().greaterThan(mass);
        if (result) {
            System.out.println("Check passed! "+ t.getName() +"'s mass is greater than " + mass);
        }
        else {
            System.out.println("Check failed! "+ t.getName() +"'s mass is not greater than " + mass);
        }
        return result;
    }
}
