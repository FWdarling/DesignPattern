package Bridge;

/*
 * 表示奖牌
 */
public class Medal{
	protected Material _material;
	protected Sport _sport;
	
	/**
	 * 构造函数
	 * @param material 材质 sport 比赛项目
	 */
	public Medal(Material material,String sport) {
		this._material=material;
		if (sport.equals("Swimming")){_sport=new Swimming();}
		else if(sport.equals("Basketball")) {_sport=new Basketball();}
		else throw new RuntimeException("运动项目不存在");
		System.out.println("奖牌创建完毕");
	}
	
	/**
	 * 显示奖牌信息
	 */
	public void printMedalInfo() {
		System.out.println(_sport.getSportName()+"-"+_material.getMaterial());
	}
	
}