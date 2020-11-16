package bridge;
import bridge.entity.Material;
import bridge.entity.Medal;
import org.junit.Test;

/**
 * 
 * @author Zhang
 *该类用于测试Bridge设计模式
 */
public class BridgeTest {
	@Test
	public void bridgeTest() {
		System.out.println("------------------");
        System.out.println("This is Bridge Test");
        System.out.println("------------------");
		Medal myMedal=new Medal(Material.Gold,"Swimming");
		myMedal.printMedalInfo();
		myMedal=new Medal(Material.Silver,"Basketball");
		myMedal.printMedalInfo();
		//异常输入测试
		myMedal=new Medal(Material.Silver,"???");
		myMedal.printMedalInfo();
	}
}
