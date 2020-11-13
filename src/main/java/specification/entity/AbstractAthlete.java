package specification.entity;

import specification.property.FoodType;
import specification.property.Mass;

/**
 * 运动员抽象类
 */
public abstract class AbstractAthlete implements Athlete {
    /**
     * 运动员有 name，mass，foodType 3给属性
     */
    private final String name;
    private final Mass mass;
    private final FoodType foodType;

    /**
     * 构造
     */
    public AbstractAthlete(String name, Mass mass, FoodType foodType){
        this.foodType = foodType;
        this.mass = mass;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s [foodType=%s, mass=%s]",
                name, foodType, mass);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public FoodType getFoodType() {
        return foodType;
    }

    @Override
    public Mass getMass() {
        return mass;
    }
}
