package strategy;

/**
 * 鸟类进食策略类
 * 继承自EatingStrategy
 */
public class BirdEating implements EatingStrategy {
    @Override
    public void eatingAlgorithm() {
        System.out.println("This bird is eating a meal of bird food!");
    }
}
