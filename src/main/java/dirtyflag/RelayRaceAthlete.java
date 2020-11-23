package dirtyflag;

import entity.Athlete;

/**
 * 接力比赛选手类
 */
public class RelayRaceAthlete extends Athlete {

    /**
     * 构造函数
     *
     * @param name   运动员名称
     * @param speed  速度，m/s
     * @param number 第几棒
     */
    public RelayRaceAthlete(String name, double speed, int number) {
        super(name);
        try {
            this.name = name;
            this.speed = speed;
            this.number = number;
            this.distance = 100 * number;
            if (speed <= 0) {
                this.speed = 10;
                throw new Exception("速度小于等于零");
            }
        } catch (Exception e) {
            System.out.println("捕获到错误：" + e.getMessage());
            System.out.println("按速度为默认值10初始化" + this.name);
        }
    }

    //    名称
    String name;
    //    当前与起点距离
    double distance = 0;
    //    是否在运动
    boolean isMoving = false;
    //    速度
    double speed;
    //    第几棒
    int number;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
