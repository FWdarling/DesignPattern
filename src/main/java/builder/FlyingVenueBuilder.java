package builder;

/**
 * 飞行类场馆建造类，继承自场馆建造类
 */
public class FlyingVenueBuilder extends StadiumBuilder{

    @Override
    public void buildSpectatorArea() {
        stadium.setSpectatorArea(12, 150);
    }

    @Override
    public void buildCompetitionArea() {
        stadium.setCompetitionArea(12, 300, "飞行区");
    }

    @Override
    public void buildSpectatorArea(int count) {
        try {
            if (count < 0) {
                throw new ArithmeticException("飞行赛场自定义观众席数量小于0，按默认值进行建造");
            }
            stadium.setSpectatorArea(count, 150);
        } catch (ArithmeticException e) {
            System.out.println("已捕获到异常错误: " + e.getMessage());
            stadium.setSpectatorArea(12, 150);
        }
    }

    @Override
    public void buildCompetitionArea(int count) {
        try {
            if (count < 2) {
                throw new ArithmeticException("飞行赛场自定义竞赛区数量小于2，按默认值进行建造");
            }
            stadium.setCompetitionArea(count, 300, "飞行区");
        } catch (ArithmeticException e) {
            System.out.println("已捕获到异常错误: " + e.getMessage());
            stadium.setCompetitionArea(12, 300, "飞行区");
        }
    }

    @Override
    public void setStadiumType() {
        stadium.setStadiumType("飞行赛场");
    }
}
