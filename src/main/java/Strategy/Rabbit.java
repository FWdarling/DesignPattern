package Strategy;

public class Rabbit extends Animal{
    @Override
    public void setEatingStrategy() {
        this.eatingStrategy = new RabbitEating();
    }
}
