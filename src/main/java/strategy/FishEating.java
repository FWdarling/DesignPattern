package strategy;

/**
 * 鱼类进食策略类
 * 继承自EatingStrategy
 */
public class FishEating implements EatingStrategy{
    @Override
    public void eatingAlgorithm() {
        System.out.println("This fish is eating a meal of seaweed!");
    }
}
