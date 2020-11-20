package builder;

/**
 * 跑步类场馆建造类，继承自场馆建造类
 */
public class RacingTrackBuilder extends StadiumBuilder {

    @Override
    public void buildSpectatorArea(int count) {
        try {
            if (count < 0) {
                throw new ArithmeticException("田径赛场自定义观众席数量小于0，按默认值进行建造");
            }
            stadium.setSpectatorArea(count, 200);
        } catch (ArithmeticException e) {
            System.out.println("已捕获到异常错误: " + e.getMessage());
            stadium.setSpectatorArea(16, 200);
        }
    }

    @Override
    public void buildCompetitionArea(int count) {
        try {
            if (count < 2) {
                throw new ArithmeticException("田径赛场自定义竞赛区数量小于2，按默认值进行建造");
            }
            stadium.setCompetitionArea(count, 200, "跑道");
        } catch (ArithmeticException e) {
            System.out.println("已捕获到异常错误: " + e.getMessage());
            stadium.setCompetitionArea(8, 200, "跑道");
        }
    }

    @Override
    public void buildSpectatorArea() {
        stadium.setSpectatorArea(16, 200);
    }

    @Override
    public void buildCompetitionArea() {
        stadium.setCompetitionArea(8, 200, "跑道");
    }

    @Override
    public void setStadiumType() {
        stadium.setStadiumType("田径赛场");
    }
}
