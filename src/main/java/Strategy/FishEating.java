package Strategy;

public class FishEating implements EatingStrategy{
    @Override
    public void eatingAlgorithm() {
        System.out.println("This fish is eating a meal of seaweed!");
    }
}
