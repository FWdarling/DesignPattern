package Strategy;

public class RabbitEating implements EatingStrategy{
    @Override
    public void eatingAlgorithm() {
        System.out.println("This rabbit is eating a meal of grass!");
    }
}
