package Command;

import Bridge.Medal;
import PrivateClassData.PlayerData;

public class Player {
	
	public PlayerData playerData;
	
	public void initPlayerData() {
		playerData=new PlayerData();
	}
	
	public void addMedal(Medal medal) {System.out.println("颁发奖牌命令成功");}
}