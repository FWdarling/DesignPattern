package specification;

import entity.Athlete;
import entity.FoodType;
import entity.Mass;

/**
 * 测试实体：海龟
 */
public class Turtle extends Athlete {
    public Turtle() {
        this(new Mass(80));
    }

    public Turtle(Mass mass) {
        super("Turtle", mass, FoodType.CARNIVORE);
    }
}
