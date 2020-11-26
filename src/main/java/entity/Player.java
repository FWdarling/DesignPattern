package entity;

import entity.Medal;
import privateclassdata.entity.PlayerData;

public class Player {


	public PlayerData playerData;

	/**
	 * 初始化运动员注册信息
	 */
	public void initPlayerData() {
		playerData=new PlayerData();
	}

	/**
	 * 向运动员添加奖牌
	 * @param medal
	 */
	public void addMedal(Medal medal) {System.out.println("颁发奖牌命令成功");}
}