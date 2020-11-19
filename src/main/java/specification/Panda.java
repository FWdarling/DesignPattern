package specification;

import entity.Athlete;
import entity.FoodType;
import entity.Mass;

/**
 * 测试实体：熊猫
 */
public class Panda extends Athlete {
    public Panda() {
        this(new Mass(300));
    }

    public Panda(Mass mass) {
        super("Panda", mass, FoodType.CARNIVORE);
    }
}
