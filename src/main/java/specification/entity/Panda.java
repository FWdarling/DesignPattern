package specification.entity;

import specification.property.FoodType;
import specification.property.Mass;

/**
 * 测试实体：熊猫
 */
public class Panda extends AbstractAthlete {
    public Panda() {
        this(new Mass(300));
    }

    public Panda(Mass mass) {
        super("Panda", mass, FoodType.CARNIVORE);
    }
}
