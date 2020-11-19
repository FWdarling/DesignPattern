package command;


//Object Medal;

import entity.Material;
import entity.Medal;
import entity.Player;

public class AwardMedalCommand implements Command {
	private Player _awardedPlayer;
	private Medal _medal;
	
	/**
	 * 初始化颁发奖牌命令
	 * @param player 颁奖运动员
	 * @param sport 体育项目
	 * @param material	奖牌材质
	 */
	public AwardMedalCommand(Player player, String sport, Material material) {
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
	
}
