package extensionobjects.concreteextensions;

import extensionobjects.abstractextensions.InjuryExtension;
import extensionobjects.overtime.InjuryOvertime;

/**
 * 伤停补时类
 */
public class Injury implements InjuryExtension {
    private final InjuryOvertime overtime;

    public Injury(InjuryOvertime injuryOvertime) {
        this.overtime = injuryOvertime;
    }

    @Override
    public void viewInjuryOvertime() {
        System.out.println("Injury overtime: "+overtime.getTime()+"");
    }

    public InjuryOvertime getOvertime() {
        return overtime;
    }
}
