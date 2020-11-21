package prototypedeepcopy;

import entity.Athlete;
import org.junit.Test;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/21,12:51
 * Version: 1.0
 */
public class PrototypeDeepCopyTest {
    @Test
    public void test() throws CloneNotSupportedException{
        System.out.println("---------------- [Pattern] Prototype ----------------");
        Athlete athlete1 = new Athlete("ALEX", "highJump");
        Athlete athlete2 = new Athlete("Cathy","highJump");
        Athlete athlete3 = new Athlete("Tim","highJump");
        Athlete athlete4 = new Athlete("Jerry","highJump");

        Certificate tmpCertificate = new Certificate(athlete1.getName(),athlete1.getSportsType(), AwardLevel.FPRSTPRIZE);
        tmpCertificate.printCertificate();

        Certificate tmpCertificate2 = (Certificate)tmpCertificate.clone();
        tmpCertificate2.setName(athlete2.getName());
        tmpCertificate2.setPrizeLevel(AwardLevel.SECONDPRIZE);

        Certificate tmpCertificate3 = (Certificate)tmpCertificate.clone();
        tmpCertificate3.setName(athlete3.getName());
        tmpCertificate3.setPrizeLevel(AwardLevel.SECONDPRIZE);

        Certificate tmpCertificate4 = (Certificate)tmpCertificate.clone();
        tmpCertificate4.setName(athlete4.getName());
        tmpCertificate4.setPrizeLevel(AwardLevel.THIRDPRIZE);

        tmpCertificate2.printCertificate();
        tmpCertificate3.printCertificate();
        tmpCertificate4.printCertificate();
        System.out.println("------------------------ END ------------------------");
    }
}
