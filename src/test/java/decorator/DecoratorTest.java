package decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void decoratorTest() {
        System.out.println("---------------- [Pattern] Decorator ----------------");
        String message = "Peter has won the tennis game!";
        InformationSenderForTennis informationSenderForTennis = new InformationSenderForTennis();
        FacebookInformationSender facebookInformationSender = new FacebookInformationSender(informationSenderForTennis);
        TwitterInformationSender twitterInformationSender = new TwitterInformationSender(facebookInformationSender);
        twitterInformationSender.sendInformation(message);
        System.out.println("------------------------ END ------------------------");
    }
}
