package extensionobjects.concreteextensions;

import extensionobjects.Race;
import extensionobjects.abstractextensions.InjuryOvertime;

/**
 * 继承并实现 InjuryOvertime 类。实现其扩展功能。
 */
public class Injury extends InjuryOvertime {
    public Injury(Race race) {
        super(race);
    }

    @Override
    public void SetOvertime(int overtime) {
        race.Overtime(overtime);
        System.out.println("Set an injury overtime for " + overtime + " minutes");
        race.GetTime();
    }
}
