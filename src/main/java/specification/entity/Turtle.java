package specification.entity;

import specification.property.FoodType;
import specification.property.Mass;

/**
 * 测试实体：海龟
 */
public class Turtle extends AbstractAthlete {
    public Turtle() {
        this(new Mass(80));
    }

    public Turtle(Mass mass) {
        super("Turtle", mass, FoodType.CARNIVORE);
    }
}
