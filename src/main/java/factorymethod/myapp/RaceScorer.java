package factorymethod.myapp;

import java.util.Random;

import entity.Result;
import factorymethod.Scorer;

/**
 * 赛跑项目记分员
 */
public class RaceScorer extends Scorer{
    /**
     * 创建成绩单
     * 获取运动员姓名，为其创建成绩单，返回
     * 这里成绩的设定采用随机设定
     * @param name
     * @return
     */
    @Override
    public Result createResult(String name) {
        Random random = new Random();
        double result = (int)((random.nextDouble()*5 + 5)*100)/100.0;
        RaceResult raceResult = new RaceResult(name, result);

        System.out.println("RaceScorer: raceResult of " + name + " is created.");

        return raceResult;
    }
}
