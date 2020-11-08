package Strategy;

public abstract class Animal {
    EatingStrategy eatingStrategy;
    public abstract void setEatingStrategy();
    public void eat(){
        this.eatingStrategy.eatingAlgorithm();
    }
    public Animal(){
        this.setEatingStrategy();
    }
}
