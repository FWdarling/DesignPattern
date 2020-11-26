package extensionobjects.concreteextensions;

import extensionobjects.Race;
import extensionobjects.abstractextensions.DrawOvertime;

/**
 * 继承并实现 DrawOvertime 类。实现其扩展功能。
 */
public class Draw extends DrawOvertime {
    public Draw(Race race) {
        super(race);
    }

    /**
     * 设置加时赛
     * @param overtime int
     */
    @Override
    public void SetOvertime(int overtime) {
        race.Overtime(overtime);
        System.out.println("Set a draw overtime for " + overtime + " minutes");
        race.GetTime();
    }
}
