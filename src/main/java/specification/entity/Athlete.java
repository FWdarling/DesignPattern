package specification.entity;

import specification.property.FoodType;
import specification.property.Mass;

/**
 * 运动员抽象类
 */
public class Athlete {
    /**
     * 运动员有 name，mass，foodType 3个属性
     */
    private final String name;
    private final Mass mass;
    private final FoodType foodType;

    /**
     * 构造
     */
    public Athlete(String name, Mass mass, FoodType foodType){
        this.foodType = foodType;
        this.mass = mass;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s [foodType=%s, mass=%s]",
                name, foodType, mass);
    }

    public String getName() {
        return name;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public Mass getMass() {
        return mass;
    }
}
