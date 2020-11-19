package specification;

import entity.Athlete;
import entity.FoodType;
import entity.Mass;

/**
 * 测试实体：史莱姆
 */
public class Slime extends Athlete {
    public Slime() {
        this(new Mass(5));
    }

    public Slime(Mass mass) {
        super("Slime", mass, FoodType.HERBIVORE);
    }
}
