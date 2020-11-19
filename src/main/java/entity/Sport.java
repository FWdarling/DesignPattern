package entity;

/**
 * 桥接(Bridge)模式
 * 实现奖牌的不同运动项目接口
 */
public interface Sport {
	
	/**
	 * 获取运动项目名称
	 * @return Sport Name
	 */
	public abstract String getSportName();
	
	
	
}
