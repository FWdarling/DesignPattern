package specification;

import org.junit.Test;
import specification.property.FoodType;
import specification.selector.FoodTypeSelector;
import specification.selector.MassGreaterThanSelector;
import specification.entity.*;

public class SpecificationTest {
    
    private void boxingSelector(Athlete athlete) {
        final var foodTypeSelector = new FoodTypeSelector(FoodType.CARNIVORE);
        final var massSelector = new MassGreaterThanSelector(200);
        foodTypeSelector.and(massSelector).test(athlete);
    }

    @Test
    public void SpecificationTest() {
        final var panda = new Panda();
        final var slime = new Slime();
        final var troll = new Troll();
        final var turtle = new Turtle();

        System.out.println("---------------------");
        System.out.println("This is Specification Test");
        System.out.println("---------------------");
        boxingSelector(slime);
        boxingSelector(panda);
        boxingSelector(troll);
        boxingSelector(turtle);
    }
}
