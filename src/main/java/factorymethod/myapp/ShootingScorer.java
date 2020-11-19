package factorymethod.myapp;

import entity.Result;
import factorymethod.Scorer;

import java.util.Random;
import java.util.Vector;

/**
 * 射击项目记分员类
 * 继承于记分员类
 */
public class ShootingScorer extends Scorer{
    /**
     * 创建成绩单
     * 获取运动员姓名，为其创建成绩单，返回
     * 成绩的设定这里使用随机设定
     * @param name
     * @return
     */
    @Override
    public Result createResult(String name) {
        Random random = new Random();

        Vector<Integer> shootingResults = new Vector<Integer>();
        for(int i=0;i<5;i++){
            shootingResults.add(random.nextInt()%5 + 6);
        }

        ShootingResult shootingResult = new ShootingResult(name, shootingResults);

        System.out.println("ShootingScorer: shootingResult of " + name + " is created.");

        return shootingResult;
    }
}
