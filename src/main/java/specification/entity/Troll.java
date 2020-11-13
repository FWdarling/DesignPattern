package specification.entity;

import specification.property.FoodType;
import specification.property.Mass;

/**
 * 测试实体：巨魔
 */
public class Troll extends AbstractAthlete {
    public Troll() {
        this(new Mass(450));
    }

    public Troll(Mass mass) {
        super("Troll", mass, FoodType.CARNIVORE);
    }
}
