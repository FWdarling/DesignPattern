package frontcontroller;
import MVC.*;
import builder.FlyingVenueBuilder;
import builder.RacingTrackBuilder;
import builder.StadiumBuilder;
import builder.StadiumDirector;
import entity.SportsMan;
import entity.Stadium;
import entity.ScoreBoard;

import java.util.ArrayList;

public class FrontController {

    /**
     * 这个数组模拟数据库，通过名字来验证是否有权利查看对应信息
     */
    String []Authorization={"root","Healy","Gerald","Trice","Yennefa","Kant"};

    /**
     * 这里情况model是和数据库的表对应，
     * 但这里没有直接new一个对象代替，
     * 没有数据库的情况下要在构建controller{model,view}加很多参数
     * 用在这个项目里面挺不合理的。
     * 这个对象的构建过程建议在最后合并的时候由其他设计模式先构建。
     * 此处给出的model的构建方法都不太合理，展示的信息效果不是很好。
     * @param name
     */
    public void identityVerification(String name){
        int flag=0;
        for (String temp:Authorization) {
            if(name.equals(temp))
            {
                if(name.equals(Authorization[0]))
                {
                    /**
                     * 管理员
                     */
                    System.out.println("你好，管理员！--查看场地信息--");
                    moveToStadium();
                }
                else{
                    /**
                     * 普通运动员
                     */
                    System.out.println("你好，运动员！--查看自己的个人信息--");
                    moveToSportsMan(name);
                }
                flag=1;
                break;
            }
        }
        //否则不在名单之中
        if(flag==0)
        {
            /**
             * 其他人
             */
            System.out.println("你好，来宾！--查看比赛情况--");
            moveToScoreBoard();
        }


    }

    /**
     * 转移到运动员控制器
     * @param name
     */
    void moveToSportsMan(String name)
    {
        SportsMan man=new SportsMan(name,50);
        //如果主main里面有全局变量，这里man就可以直接由全局变量给出。
        //这里年龄随便给了。
        SportsManView testView=new SportsManView();
        SportsManController testController=new SportsManController(man,testView);
        testController.printDetails(name,50);
    }

    /**
     * 转移到计分板控制器
     */
    void moveToScoreBoard()
    {
        ScoreBoard scoreBoard=new ScoreBoard();
        //这个scoreBoard还是应该先用callback模式去构建一下增添信息
        //由于另一个同学的计分板是需要和观众互动（需要输入），建议这个直接写到主main里面展示。
        //到时候这个scoreBoard作为一个全局变量，改动这里的代码，让用户先输入有具体输赢战绩再展示。
        ScoreBoardView scoreBoardView=new ScoreBoardView();
        ScoreBoardController scoreBoardController=new ScoreBoardController(scoreBoard,scoreBoardView);
        scoreBoardController.printDetails(scoreBoard);
    }

    /**
     * 转移到体育场地控制器
     */
    void moveToStadium()
    {
        StadiumView stadiumView=new StadiumView();

        //这里的两个构造器builder直接默认给出。
        //主main合并可以由全局变量给出。
        StadiumDirector stadiumConstractor = new StadiumDirector();

        StadiumBuilder racingTrackBuilder = new RacingTrackBuilder();
        StadiumBuilder flyingVenueBuilder = new FlyingVenueBuilder();

        stadiumConstractor.CompetitionAreaCount(20).SpectatorAreaCount(12).setStadiumBuilder(racingTrackBuilder);
        stadiumConstractor.constructStadium();

        StadiumController stadiumController1=new StadiumController(stadiumConstractor,stadiumView);


        //stadiumController1.printDetails();

        stadiumConstractor.CompetitionAreaCount(20).SpectatorAreaCount(12).setStadiumBuilder(flyingVenueBuilder);
        stadiumConstractor.constructStadium();

        StadiumController stadiumController2=new StadiumController(stadiumConstractor,stadiumView);
        //stadiumController2.printDetails();
    }


}
