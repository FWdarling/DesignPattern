/**
 * @author Mew Y
 * @version 0.1
 * @description 单例模式：主办方（Sponsor）类
 */
package singleton;

public class Sponsor {
    /**
     * @description Sponsor 的属性
     */
    private String name;
    private volatile static Sponsor instance = new Sponsor();

    /**
     * @description Sponsor 的构造函数
     */
    private Sponsor(){ name = "A Great Sponsor"; }

    /**
     * @description 返回唯一的 Sponsor 实例
     * @return Sponsor
     */
    public static Sponsor getInstance(){
        return instance;
    }

    /**
     * @description 获取 Sponsor 名字
     * @return String
     */
    public String getName(){
        return this.name;
    }
}
