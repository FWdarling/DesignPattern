package mediator;

import cn.edu.tongji.team.patterns.mediator.*;
import org.junit.Test;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 15:46 2020/12/3
 * @Modified By:
 **/
public class MediatorTest {
    @Test
    public void mediatorTest(){
        AbstractMediator mediator = new CounterMediator();
        ShoppingListColleague shoppingListColleague = new ShoppingListColleague(mediator);
        BalanceColleague balanceColleague = new BalanceColleague(mediator);
        RepositoryColleague repositoryColleague = new RepositoryColleague(mediator);

        System.out.println("shoppingListColleague测试");
        shoppingListColleague.sendMethod();

        System.out.println("\nbalanceColleague测试");
        balanceColleague.sendMethod();

        System.out.println("\nRepositoryColleague测试");
        repositoryColleague.sendMethod();
    }
}
