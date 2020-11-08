package Strategy;

public class Bird extends Animal{
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new BirdEating();
    }
}
