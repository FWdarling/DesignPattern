package command;

import entity.Material;
import entity.Player;
import org.junit.Test;

/**
 * 
 * @author Zhang
 *该类用于测试Command设计模式
 */
public class CommandTest {
	@Test
	public void commandTest() {
		System.out.println("---------------- [Pattern] Command ----------------");
        Player myPlayer=new Player();
		AwardMedalCommand command=new AwardMedalCommand(myPlayer,"Swimming", Material.Gold);
		command.execute();
		System.out.println("------------------------ END ------------------------");
	}
}
