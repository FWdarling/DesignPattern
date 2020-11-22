package specification;

import org.junit.Test;
import static specification.SelectorDemo.boxingSelector;

public class SpecificationTest {

    @Test
    public void SpecificationTest() {
        System.out.println("---------------- [Pattern] Specification ----------------");
        final Panda panda = new Panda();
        final Slime slime = new Slime();
        final Troll troll = new Troll();
        final Turtle turtle = new Turtle();

        boxingSelector(slime);
        boxingSelector(panda);
        boxingSelector(troll);
        boxingSelector(turtle);
        System.out.println("------------------------ END ------------------------");
    }
}
