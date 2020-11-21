package command;

import entity.*;
import observer.RunAthlete;
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

		Game runGame1 = new Game(SportType.run);
		RunAthlete runAthlete1 = new RunAthlete("阿猫");
		runGame1.assignReferee();
		Referee runReferee1 = runGame1.getReferee();

		AnnounceCommand myCommand=new AnnounceCommand(runReferee1,runAthlete1);
		myCommand.execute();
	}
}
