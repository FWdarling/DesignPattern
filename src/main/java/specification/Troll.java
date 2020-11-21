package specification;

import entity.Athlete;
import entity.FoodType;
import entity.Mass;

/**
 * 测试实体：巨魔
 * - 肉食动物
 * - 体重 450kg
 */
public class Troll extends Athlete {
    public Troll() {
        super("Troll", new Mass(450), FoodType.CARNIVORE);
    }
}
