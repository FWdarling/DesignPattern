package composite;

import org.junit.Test;



public class CompositeTest {
    @Test
    public static void main(String []args)
    {
        Locker Ball=new Locker("Çò");

        Locker HollowBall=new Locker("¿ÕÐÄÇò");
        Ball.add(HollowBall);

        Equipment basketball=new Equipment("ÀºÇò",120);
        Equipment football=new Equipment("×ãÇò",100);

        HollowBall.add(basketball).add(football);


        Ball.PrintList();
        System.out.println("");
        HollowBall.GetFullCategory();


        Equipment GymnasticsExhibitionBall=new Equipment("Ìå²Ù±íÑÝÇò",500);
        HollowBall.add(GymnasticsExhibitionBall);

        Ball.PrintList();
        System.out.println("");
        GymnasticsExhibitionBall.GetFullCategory();




    }


}
