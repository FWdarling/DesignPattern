/**
 * @author Mew Y
 * @version 0.1
 * @description 扩展对象模式：加时赛（Overtime）类
 */
package extensionobjects.overtime;

import extensionobjects.abstractextensions.OvertimeExtension;

public class Overtime {
    private int time;
    protected OvertimeExtension overtimeExtension = null;

    public Overtime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public OvertimeExtension getOvertimeExtension(String extensionName) {
        return null;
    }
}
