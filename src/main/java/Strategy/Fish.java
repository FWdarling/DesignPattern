package Strategy;

public class Fish extends Animal{
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new FishEating();
    }

    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new FishTraning();
    }
}
