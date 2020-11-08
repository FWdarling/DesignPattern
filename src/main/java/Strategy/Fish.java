package Strategy;

public class Fish extends Animal{
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new FishEating();
    }
}
