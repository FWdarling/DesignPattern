package composite;

import org.junit.Test;



public class CompositeTest {
    @Test
    public void compositetest()
    {
        Locker Ball=new Locker("球");

        Locker HollowBall=new Locker("空心球");
        Ball.add(HollowBall);

        Equipment basketball=new Equipment("篮球",120);
        Equipment football=new Equipment("足球",100);

        /**
         *在空心球这个划分下面添加具体的篮球和足球两个运动器材。
         */
        HollowBall.add(basketball).add(football);


        Ball.PrintList();
        System.out.println("");
        HollowBall.GetFullCategory();


        Equipment GymnasticsExhibitionBall=new Equipment("体操表演球",500);
        HollowBall.add(GymnasticsExhibitionBall);

        Ball.PrintList();
        System.out.println("");
        GymnasticsExhibitionBall.GetFullCategory();




    }


}
