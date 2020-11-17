package extensionobjects.overtime;

import extensionobjects.abstractextensions.OvertimeExtension;
import extensionobjects.concreteextensions.Injury;
import java.util.Optional;

public class InjuryOvertime extends Overtime {
    public InjuryOvertime(int time) {
        super(time);
    }

    @Override
    public OvertimeExtension getOvertimeExtension (String extensionName) {
        if (extensionName.equals("OvertimeExtension")) {
            return Optional.ofNullable(overtimeExtension).orElseGet(() -> new Injury(this));
        }

        return super.getOvertimeExtension(extensionName);
    }
}
