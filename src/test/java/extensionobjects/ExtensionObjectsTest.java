package extensionobjects;

import extensionobjects.concreteextensions.Draw;
import extensionobjects.concreteextensions.Injury;
import extensionobjects.overtime.*;
import org.junit.Test;

public class ExtensionObjectsTest {
    @Test

    public void ExtensionObjectsTest (){
        System.out.println("---------------------");
        System.out.println("This is Extension Objects Test");
        System.out.println("---------------------");
        final var injury = new Injury(new InjuryOvertime(5));
        final var draw = new Draw(new DrawOvertime(15));
        injury.viewInjuryOvertime();
        draw.viewDrawOvertime();
    }
}
