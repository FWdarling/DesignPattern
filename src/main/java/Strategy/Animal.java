package Strategy;

public abstract class Animal {
    EatingStrategy eatingStrategy;
    TrainingStrategy trainingStrategy;
    public abstract void setEatingStrategy();
    public abstract void setTrainingStrategy();
    public void eat(){
        this.eatingStrategy.eatingAlgorithm();
    }
    public void train(){this.trainingStrategy.trainingAlgorithm();}
    public Animal(){
        this.setEatingStrategy();
        this.setTrainingStrategy();
    }
}
