package extensionobjects;

import extensionobjects.concreteextensions.Draw;
import extensionobjects.concreteextensions.Injury;

/**
 * 具体的主体类
 * 实现基类定义的 GetExtension 方法并返回相应的扩展对象。
 */
public class ConcreteRace extends Race {
    private int raceTime = 90;
    private Injury injury;
    private Draw draw;

    /**
     * 构造扩展对象：两种加时赛
     */
    public ConcreteRace() {
        injury = new Injury(this);
        draw = new Draw(this);
    }

    /**
     * 实现查询比赛时长接口
     */
    @Override
    public void GetTime() {
        System.out.println("Total time of this race: " + raceTime + " minutes");
    }

    /**
     * 实现添加加时赛接口
     * @param overtime
     */
    @Override
    public void Overtime(int overtime){
        raceTime += overtime;
    }

    /**
     * 实现查询扩展对象
     * @param extensionType
     * @return Overtime
     */
    @Override
    public Overtime GetExtension(String extensionType) {
        if(extensionType.equals("Injury")) {
            return this.injury;
        }
        else if(extensionType.equals("Draw")) {
            return this.draw;
        }

        return null;
    }
}
