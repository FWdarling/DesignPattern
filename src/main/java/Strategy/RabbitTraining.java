package Strategy;

/**
 * 兔类训练类
 * 继承自TrainingStrategy接口
 * 实例化兔类训练方法
 */
public class RabbitTraining implements TrainingStrategy {
    @Override
    public void trainingAlgorithm() {
        System.out.println("This rabbit is training for running competition!");
    }
}
