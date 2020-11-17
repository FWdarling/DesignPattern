package specification;

import org.junit.Test;
import specification.property.FoodType;
import specification.selector.FoodTypeSelector;
import specification.selector.MassGreaterThanSelector;
import specification.entity.*;

public class SpecificationTest {

    private boolean boxingSelector(Athlete athlete) {
        final FoodTypeSelector foodTypeSelector = new FoodTypeSelector(FoodType.CARNIVORE);
        final MassGreaterThanSelector massSelector = new MassGreaterThanSelector(200);
        return foodTypeSelector.and(massSelector).test(athlete);
    }

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
