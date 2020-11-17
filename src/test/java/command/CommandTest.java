package command;

import bridge.entity.Material;
import command.entity.Player;
import org.junit.Test;

/**
 * 
 * @author Zhang
 *该类用于测试Command设计模式
 */
public class CommandTest {
	@Test
	public void commandTest() {
		System.out.println("------------------");
        System.out.println("This is Command Test");
        System.out.println("------------------");
        Player myPlayer=new Player();
		AwardMedalCommand command=new AwardMedalCommand(myPlayer,"Swimming", Material.Gold);
		command.execute();
	}
}
