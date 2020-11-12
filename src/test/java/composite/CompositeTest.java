package composite;

import org.junit.Test;



public class CompositeTest {
    @Test
    public static void main(String []args)
    {
        Locker Ball=new Locker("��");

        Locker HollowBall=new Locker("������");
        Ball.add(HollowBall);

        Equipment basketball=new Equipment("����",120);
        Equipment football=new Equipment("����",100);

        HollowBall.add(basketball).add(football);


        Ball.PrintList();
        System.out.println("");
        HollowBall.GetFullCategory();


        Equipment GymnasticsExhibitionBall=new Equipment("��ٱ�����",500);
        HollowBall.add(GymnasticsExhibitionBall);

        Ball.PrintList();
        System.out.println("");
        GymnasticsExhibitionBall.GetFullCategory();




    }


}
