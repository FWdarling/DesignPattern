package PrivateClassData;
import Command.Player;
import org.junit.Test;

/**
 * 
 * @author Zhang
 *该类用于测试PrivateClassData设计模式
 */
public class PrivateClassDataTest {
	@Test
	public void PrivateClassDataTest() {
		System.out.println("------------------");
        System.out.println("This is PrivateClassData Test");
        System.out.println("------------------");
		Player myPlayer=new Player();
		//初始化运动员信息
		myPlayer.initPlayerData();
		PlayerData myData=myPlayer.playerData;
		System.out.println(myData.getPlayerId());
		System.out.println(myData.getPlayerName());
		System.out.println(myData.getPlayerType());
		
		//设置运动员信息
		myData.setPlayerId("CNN1");
		myData.setPlayerName("KiKi");
		myData.setPlayerType("Monkey");
		
		//检查输出
		System.out.println(myPlayer.playerData.getPlayerId());
		System.out.println(myPlayer.playerData.getPlayerName());
		System.out.println(myPlayer.playerData.getPlayerType());
	}
}

