package test.Prototype;

import main.Prototype.Certificate;
import main.Prototype.Prize;
import main.Prototype.entity.AnimalType;
import main.Prototype.entity.Athlete;
import org.junit.Test;

/**
 * @Author: CINDY DENG
 * @Date: 2020/11/12,22:54
 * @Version: 1.0
 */
public class PrototypeTest {
    @Test
    public void test() throws CloneNotSupportedException{
        System.out.println("====Prototype===");
        Athlete athlete1 = new Athlete("ALEX", AnimalType.CAT,"highJump");
        Athlete athlete2 = new Athlete("Cathy",AnimalType.DOG,"highJump");
        Athlete athlete3 = new Athlete("Tim",AnimalType.TIGER,"highJump");
        Athlete athlete4 = new Athlete("Jerry",AnimalType.ELEPHANT,"highJump");

        Certificate tmpCertificate = new Certificate(athlete1.getName(),athlete1.getSportsType(), Prize.FPRSTPRIZE);
        tmpCertificate.printCertificate();

        Certificate tmpCertificate2 = (Certificate)tmpCertificate.clone();
        tmpCertificate2.setName(athlete2.getName());
        tmpCertificate2.setPrizeLevel(Prize.SECONDPRIZE);

        Certificate tmpCertificate3 = (Certificate)tmpCertificate.clone();
        tmpCertificate3.setName(athlete3.getName());
        tmpCertificate3.setPrizeLevel(Prize.SECONDPRIZE);

        Certificate tmpCertificate4 = (Certificate)tmpCertificate.clone();
        tmpCertificate4.setName(athlete4.getName());
        tmpCertificate4.setPrizeLevel(Prize.THIRDPRIZE);

        tmpCertificate2.printCertificate();
        tmpCertificate3.printCertificate();
        tmpCertificate4.printCertificate();
    }
}
