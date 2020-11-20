package specification;

import entity.Athlete;
import entity.FoodType;
import entity.Mass;

/**
 * 测试实体：史莱姆
 * - 草食动物
 * - 体重 5kg
 */
public class Slime extends Athlete {
    public Slime() {
        super("Slime", new Mass(5), FoodType.HERBIVORE);
    }
}
