package extensionobjects;

import org.junit.Test;

public class ExtensionObjectsTest {
    @Test

    public void ExtensionObjectsTest (){
        System.out.println("---------------- [Pattern] ExtensionObjects ----------------");
        Race race = new ConcreteRace();
        Overtime overtimeInjury = race.GetExtension("Injury");
        Overtime overtimeDraw = race.GetExtension("Draw");
        overtimeInjury.SetOvertime(5);
        overtimeDraw.SetOvertime(15);
        System.out.println("------------------------ END ------------------------");
    }
}
