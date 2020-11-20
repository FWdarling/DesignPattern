package extensionobjects;

/**
 * 抽象主体对象：比赛
 * 定义用于查询是否包含特定扩展的接口 GetExtension
 */
public abstract class Race {
    /**
     * 查询比赛时长接口
     */
    public abstract void GetTime();

    /**
     * 添加加时赛接口
     * @param overtime
     */
    public abstract void Overtime(int overtime);

    /**
     * 查询扩展对象接口
     * @param extensionType
     * @return Overtime
     */
    public abstract Overtime GetExtension(String extensionType);
}
