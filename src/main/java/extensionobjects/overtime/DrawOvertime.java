package extensionobjects.overtime;

import extensionobjects.abstractextensions.OvertimeExtension;
import extensionobjects.concreteextensions.Draw;
import java.util.Optional;

public class DrawOvertime extends Overtime {
    public DrawOvertime(int time) {
        super(time);
    }

    @Override
    public OvertimeExtension getOvertimeExtension (String extensionName) {
        if (extensionName.equals("OvertimeExtension")) {
            return Optional.ofNullable(overtimeExtension).orElseGet(() -> new Draw(this));
        }

        return super.getOvertimeExtension(extensionName);
    }
}
