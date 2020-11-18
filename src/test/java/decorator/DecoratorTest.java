package decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void decoratorTest() {
        String message = "Peter has won the tennis game!";
        InformationSenderForTennis informationSenderForTennis = new InformationSenderForTennis();
        FacebookInformationSender facebookInformationSender = new FacebookInformationSender(informationSenderForTennis);
        TwitterInformationSender twitterInformationSender = new TwitterInformationSender(facebookInformationSender);
        twitterInformationSender.sendInformation(message);
    }
}
