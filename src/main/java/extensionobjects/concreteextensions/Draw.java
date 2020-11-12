package extensionobjects.concreteextensions;

import extensionobjects.abstractextensions.DrawExtension;
import extensionobjects.overtime.DrawOvertime;

public class Draw implements DrawExtension {
    private final DrawOvertime overtime;

    public Draw(DrawOvertime drawOvertime) {
        this.overtime = drawOvertime;
    }

    @Override
    public void viewDrawOvertime() {
        System.out.println("Draw overtime: "+overtime.getTime()+"");
    }

    public DrawOvertime getOvertime() {
        return overtime;
    }
}
