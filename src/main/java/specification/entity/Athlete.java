package specification.entity;

import specification.property.FoodType;
import specification.property.Mass;

/**
 * 运动员类接口
 */
public interface Athlete {
    Mass getMass();

    FoodType getFoodType();

    String getName();
}
