package Strategy;

public class Rabbit extends Animal{
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new RabbitEating();
    }

    @Override
    public void setTrainingStrategy() {
        this.trainingStrategy = new RabbitTraining();
    }
}
