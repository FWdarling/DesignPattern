package specification;

import entity.Athlete;
import entity.FoodType;
import entity.Mass;

/**
 * 测试实体：海龟
 * - 肉食动物
 * - 体重 80kg
 */
public class Turtle extends Athlete {
    public Turtle() {
        super("Turtle", new Mass(80), FoodType.CARNIVORE);
    }
}
