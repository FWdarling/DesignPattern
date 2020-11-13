package proxy.entity;

import java.util.concurrent.TimeUnit;

/**
 * 动物运动员类，接收采访的真实类
 */
public class AnimalAthlete {
    //    运动员姓名
    private String name;
    //    运动员物种
    private String species;

    /**
     * 初始化构造方法
     *
     * @param name    运动员名字
     * @param species 运动员物种
     */
    public AnimalAthlete(String name, String species) {
        this.name = name;
        this.species = species;
    }

    /**
     * 采访
     *
     * @param questions 采访提问的String数组
     * @return 返回采访是否成功
     * @throws InterruptedException timeunit sleep被打断异常抛出
     */
    public boolean interview(String[] questions) throws InterruptedException {
//        运动员介绍
        System.out.println(this.name + " is a " + this.species);
//        采访开始
        System.out.println("The interview is start!");
//        回答每一个问题
        for (String question : questions
        ) {
            System.out.println(name + " answered the question: " + question);
            TimeUnit.SECONDS.sleep(1);
        }
//        采访结束
        System.out.println("The interview is over!");
        return true;
    }

    //    获取运动员姓名
    public String getName() {
        return this.name;
    }
}
