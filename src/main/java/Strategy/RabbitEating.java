package Strategy;

/**
 * 兔类进食策略类
 * 继承自EatingStrategy
 */
public class RabbitEating implements EatingStrategy{
    @Override
    public void eatingAlgorithm() {
        System.out.println("This rabbit is eating a meal of grass!");
    }
}
