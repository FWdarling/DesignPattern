package Strategy;

public class BirdEating implements EatingStrategy {
    @Override
    public void eatingAlgorithm() {
        System.out.println("This bird is eating a meal of bird food!");
    }
}
