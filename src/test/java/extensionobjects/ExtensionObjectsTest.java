package extensionobjects;

import org.junit.Test;

public class ExtensionObjectsTest {
    @Test

    public void ExtensionObjectsTest (){
        System.out.println("---------------------");
        System.out.println("This is Extension Objects Test");
        System.out.println("---------------------");
        Race race = new ConcreteRace();
        Overtime overtimeInjury = race.GetExtension("Injury");
        Overtime overtimeDraw = race.GetExtension("Draw");
        overtimeInjury.SetOvertime(5);
        overtimeDraw.SetOvertime(15);
    }
}
