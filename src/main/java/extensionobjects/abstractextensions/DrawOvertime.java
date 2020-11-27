package extensionobjects.abstractextensions;

import extensionobjects.Overtime;
import extensionobjects.Race;

/**
 * 特定种类的扩展类的抽象基类：平局加时
 */
public abstract class DrawOvertime extends Overtime {
    /**
     * 构造平局加时
     * @param race DrawOvertime
     */
    public DrawOvertime(Race race) {
        super(race);
    }
}
