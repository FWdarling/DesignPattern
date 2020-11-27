package extensionobjects.abstractextensions;

import extensionobjects.Overtime;
import extensionobjects.Race;

/**
 * 特定种类的扩展类的抽象基类：伤停补时
 */
public abstract class InjuryOvertime extends Overtime {
    /**
     * 构造伤停补时
     * @param race InjuryOvertime
     */
    public InjuryOvertime(Race race) {
        super(race);
    }
}
