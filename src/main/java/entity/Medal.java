package entity;

import bridge.Basketball;
import bridge.Swimming;

/*
 * 表示奖牌
 */

/**
 * description: 在原代码基础上加以修改,以实现Immutable模式,主要改动为将类名和属性名前添加final,同时将属性改为private,以使Medal类不可修改
 * date:11/24/20 01:39 AM
 * author: cjsmt
 */
public final class Medal{
	private final Material _material;
	private final Sport _sport;
	
	/**
	 * 构造函数
	 * @param material 材质 sport 比赛项目
	 */
	public Medal(Material material,String sport){
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