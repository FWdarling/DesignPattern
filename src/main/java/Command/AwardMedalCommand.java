package Command;

import Bridge.Material;
import Bridge.Medal;
//Object Medal;

public class AwardMedalCommand implements Command{
	Player _awardedPlayer;
	Medal _medal;
	
	/**
	 * 初始化颁发奖牌命令
	 * @param player 颁奖运动员
	 * @param sport 体育项目
	 * @param material	奖牌材质
	 */
	public AwardMedalCommand(Player player,String sport,Material material) {
		//进行初始化
		_medal=new Medal(material,sport);
		_awardedPlayer=player;
	}
	
	
	/**
	 * 执行颁发奖牌
	 */
	public void execute() {
		_medal.printMedalInfo();
		_awardedPlayer.addMedal(_medal);
	}
	
	
	
	/*public static void main(String args[]) {
		Player myPlayer=new Player();
		AwardMedalCommand command=new AwardMedalCommand(myPlayer,"Swimming",Material.Gold);
		command.execute();
	}*/
}
