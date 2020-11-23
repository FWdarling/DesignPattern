package mediator;

import org.junit.Test;

public class MediatorTest {
    @Test
    public void mediatorTest() {
        System.out.println("---------------- [Pattern] Mediator ----------------");
        DispatchMediator dispatchMediator = new DispatchMediator();
        TennisCourt tennisCourt = new TennisCourt(dispatchMediator);
        FootballCourt footballCourt = new FootballCourt(dispatchMediator);
        BasketballCourt basketballCourt = new BasketballCourt(dispatchMediator);

        dispatchMediator.setTennisCourt(tennisCourt);
        dispatchMediator.setFootballCourt(footballCourt);
        dispatchMediator.setBasketballCourt(basketballCourt);

        tennisCourt.changeStartTime("2");
        tennisCourt.borrow("BasketballCourt");
        footballCourt.borrow("BasketballCourt");

        System.out.println("------------------------ END ------------------------");
    }
}
