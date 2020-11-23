package singleton;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void SingletonTest(){
        System.out.println("---------------- [Pattern] Singleton ----------------");
        Sponsor thisSponsor = Sponsor.getInstance();
        Sponsor thatSponsor = Sponsor.getInstance();
        if(thisSponsor == thatSponsor) {
            System.out.println("This Sponsor("+thisSponsor.toString()+") and that Sponsor("+thatSponsor.toString()+") are the same one.");
            System.out.println("The Sponsor's name is: "+thisSponsor.getName()+"");
        }
        else {
            System.out.println("This Sponsor("+thisSponsor.toString()+") and that Sponsor("+thatSponsor.toString()+") are not the same one.");
        }
        System.out.println("------------------------ END ------------------------");
    }
}
