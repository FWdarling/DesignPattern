package specification;

import entity.Athlete;
import entity.FoodType;
import entity.Mass;

/**
 * 测试实体：熊猫
 * - 肉食动物
 * - 体重 300kg
 */
public class Panda extends Athlete {
    public Panda() {
        super("Panda", new Mass(300), FoodType.CARNIVORE);
    }
}
