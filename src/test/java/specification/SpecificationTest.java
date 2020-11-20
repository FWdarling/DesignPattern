package specification;

import org.junit.Test;
import static specification.SelectorDemo.boxingSelector;

public class SpecificationTest {

    @Test
    public void SpecificationTest() {
        final Panda panda = new Panda();
        final Slime slime = new Slime();
        final Troll troll = new Troll();
        final Turtle turtle = new Turtle();

        System.out.println("---------------------");
        System.out.println("This is Specification Test");
        System.out.println("---------------------");
        boxingSelector(slime);
        boxingSelector(panda);
        boxingSelector(troll);
        boxingSelector(turtle);
    }
}
