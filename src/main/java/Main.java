import MVC.SportsManController;
import MVC.SportsManView;
import abstractfactory.AbstractFactoryDemo;
import activeobject.Alarm;
import activeobject.SecuritySystem;
import activeobject.SleepCommand;
import adapter.AdapterDemo;
import balking.ChangeThread;
import balking.SaveThread;
import builder.*;
import businessdelegate.Dog;
import businessdelegate.OfflineQuery;
import businessdelegate.QueryDelegate;
import callback.CallbackDemo;
import chainofresponsibility.SetReferees;
import command.AwardMedalCommand;
import composite.Equipment;
import composite.Locker;
import converter.ConverterDemo;
import decorator.FacebookInformationSender;
import decorator.InformationSenderForTennis;
import decorator.TwitterInformationSender;
import dirtyflag.RelayRace;
import dirtyflag.RelayRaceTeam;
import doublecheckedlocking.MyThread;
import entity.*;
import extensionobjects.ConcreteRace;
import extensionobjects.Overtime;
import extensionobjects.Race;
import facade.FacadeDemo;
import factorymethod.FactoryMethodDemo;
import filter.DishesFilterDemo;
import flyweight.FlyWeightDemo;
import frontcontroller.FrontController;
import immutable.ImmutableDemo;
import interpreter.Const;
import interpreter.MatchException;
import interpreter.MatchExpression;
import iterator.ManCollection;
import iterator.MenuIterator;
import lazyloading.LazyLoadingDemo;
import mediator.BasketballCourt;
import mediator.DispatchMediator;
import mediator.FootballCourt;
import mediator.TennisCourt;
import memento.MementoDemo;
import multiton.RoomDistributor;
import nullobject.NullObjectDemo;
import observer.ObserverDemo;
import pipeline.PipelineDemo;
import privateclassdata.entity.PlayerData;
import producerconsumer.DrinkerThread;
import producerconsumer.MakerThread;
import prototype.AwardLevel;
import prototype.Certificate;
import proxy.AthleteProxy;
import proxy.Reporter;
import simplefactory.SimpleFactoryDemo;
import singleton.Sponsor;
import specification.Panda;
import specification.Slime;
import specification.Troll;
import specification.Turtle;
import state.StateDemo;
import strategy.Bird;
import strategy.Fish;
import strategy.Rabbit;
import template.TemplateDemo;
import transferobject.PersonalInformation;
import transferobject.QuerySystem;
import visitor.*;
import workerthread.CheckPoint;
import workerthread.RunnerThread;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static specification.SelectorDemo.boxingSelector;

public class Main {
    public static void main(String[] args){

        System.out.println("---------------- 初始 & 通用场景构建 ----------------\n\n");


        System.out.println("---------------- [Pattern] DoubleCheckedLocking ----------------");
        MyThread[] threads = new MyThread[10];
        for(int i = 0;i<10;i++){
            threads[i] = new MyThread(i);
        }

        for(MyThread thread : threads){
            System.out.println("                                        [ MyThread : run() : 重写run()方法，根据具体情景启动线程 ]");
            thread.run();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Singleton ----------------");
        System.out.println("                                        " +
                "[ Sponsor : getInstance() : 获取一个 Sponsor 实例 ]");
        Sponsor thisSponsor = Sponsor.getInstance();
        System.out.println("                                        " +
                "[ Sponsor : getInstance() : 获取另一个 Sponsor 实例 ]");
        Sponsor thatSponsor = Sponsor.getInstance();
        if(thisSponsor == thatSponsor) {
            System.out.println("This Sponsor("+thisSponsor.toString()+
                    ") and that Sponsor("+thatSponsor.toString()+") are the same one.");
            System.out.println("                                        " +
                    "[ Sponsor : getName() : 获取 Sponsor 名称 ]");
            System.out.println("The Sponsor's name is: "+thisSponsor.getName()+"");
        }
        else {
            System.out.println("This Sponsor("+thisSponsor.toString()+
                    ") and that Sponsor("+thatSponsor.toString()+") are not the same one.");
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Visitor ----------------");
        VisitorDemo.VisitTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Builder ----------------");
//        生成指挥者类
        StadiumDirector stadiumDirector = new StadiumDirector();

//        场馆建造者类
        StadiumBuilder racingTrackBuilder = new RacingTrackBuilder();
        StadiumBuilder flyingVenueBuilder = new FlyingVenueBuilder();
        StadiumBuilder swimmingPoolBuilder = new SwimmingPoolBuilder();

//        给指挥者类设定建造者
        System.out.println("                                        [ StadiumDirector : setStadiumBuilder(StadiumBuilder) : 给指挥者类设置要建造的场馆类型 ]");
        stadiumDirector.setStadiumBuilder(racingTrackBuilder);

        System.out.println("                                        [ StadiumDirector : setStadiumBuilder(StadiumBuilder) : 给指挥者类设置要建造的场馆类型 ]");
        stadiumDirector.setStadiumBuilder(flyingVenueBuilder);
        System.out.println("                                        [ StadiumDirector : constructStadium() : 经典模式，建造具体场馆 ]");
        stadiumDirector.constructStadium();

        System.out.println("                                        [ StadiumDirector : CompetitionAreaCount(int) : 设置场地竞赛区数 ]");
        System.out.println("                                        [ StadiumDirector : SpectatorAreaCount(int) : 设置场地观众席数 ]");
        System.out.println("                                        [ StadiumDirector : constructStadium() : 变种模式，链式调用自定义区域数量 ]");
        stadiumDirector.CompetitionAreaCount(3).SpectatorAreaCount(14).constructStadium();


        System.out.println("                                        [ StadiumDirector : setStadiumBuilder(StadiumBuilder) : 给指挥者类设置要建造的场馆类型 ]");
        stadiumDirector.setStadiumBuilder(swimmingPoolBuilder);
        System.out.println("                                        [ StadiumDirector : CompetitionAreaCount(int) : 设置场地竞赛区数，出错测试-给定数量为负数 ]");
        System.out.println("                                        [ StadiumDirector : SpectatorAreaCount(int) : 设置场地观众席数 ]");
        System.out.println("                                        [ StadiumDirector : constructStadium() : 变种模式，链式调用自定义区域数量 ]");
        stadiumDirector.CompetitionAreaCount(-5).SpectatorAreaCount(12).constructStadium();

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Multiton ----------------");
        RoomDistributor roomDistributor = new RoomDistributor();
        System.out.println("                                        [ RoomDistributor : applyRoom() : 分配训练房间 ]");
        TrainingRoom trainingRoom1 = roomDistributor.applyRoom();
        System.out.println("                                        [ RoomDistributor : applyRoom() : 分配训练房间 ]");
        TrainingRoom trainingRoom2 = roomDistributor.applyRoom();
        System.out.println("                                        [ RoomDistributor : applyRoom() : 分配训练房间 ]");
        TrainingRoom trainingRoom3 = roomDistributor.applyRoom();
        System.out.println("                                        [ RoomDistributor : applyRoom() : 分配训练房间 ]");
        TrainingRoom trainingRoom4 = roomDistributor.applyRoom();
        try {
            System.out.println("                                        [ TrainingRoom : showRoom() : 展示训练房间信息 ]");
            trainingRoom1.showRoom();
            System.out.println("                                        [ TrainingRoom : showRoom() : 展示训练房间信息 ]");
            trainingRoom2.showRoom();
            System.out.println("                                        [ TrainingRoom : showRoom() : 展示训练房间信息 ]");
            trainingRoom3.showRoom();
            System.out.println("                                        [ TrainingRoom : repayRoom() : 返还获取的房间 ]");
            trainingRoom2.repayRoom();
            System.out.println("                                        [ RoomDistributor : applyRoom() : 分配训练房间 ]");
            trainingRoom4 = roomDistributor.applyRoom();
            System.out.println("                                        [ TrainingRoom : showRoom() : 展示训练房间信息 ]");
            trainingRoom4.showRoom();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Iterator ----------------");
        LazyLoadingDemo.lazyLoadingTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] PrivateClassData ----------------");
        Player myPlayer=new Player();
        //初始化运动员信息
        myPlayer.initPlayerData();
        PlayerData myData=myPlayer.playerData;
        System.out.println(myData.getPlayerId());
        System.out.println(myData.getPlayerName());
        System.out.println(myData.getPlayerType());

        //设置运动员信息
        myData.setPlayerId("CNN1");
        myData.setPlayerName("KiKi");
        myData.setPlayerType("Monkey");

        //检查输出
        System.out.println(myPlayer.playerData.getPlayerId());
        System.out.println(myPlayer.playerData.getPlayerName());
        System.out.println(myPlayer.playerData.getPlayerType());
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] ActiveObject ----------------");
        SecuritySystem system = new SecuritySystem();
        Alarm carnivoreAreaAlarm = new Alarm(2000, "肉食动物区警报", system);
        Alarm herbivoreAreaAlarm = new Alarm(5000, "草食动物区警报", system);
        System.out.println("                                        " +
                "[ SecuritySystem : addAlarm() : 向系统添加警报 ]");
        system.addAlarm(carnivoreAreaAlarm);
        system.addAlarm(herbivoreAreaAlarm);
        System.out.println("                                        " +
                "[ SecuritySystem : shutCommand() : 向系统提交关闭指令 ]");
        Alarm.ShutCommand shutCommand = new Alarm.ShutCommand();
        system.addCommand(new SleepCommand(10100, system, shutCommand));
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
        System.out.println("安保系统于"+df.format(new Date())+"开启");
        system.run();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Specification ----------------");
        final Panda panda = new Panda();
        final Slime slime = new Slime();
        final Troll troll = new Troll();
        final Turtle turtle = new Turtle();

        System.out.println("                                        " +
                "[ SelectorDemo : boxingSelector() : 测试运动员：slime 是否有拳击比赛参赛资格 ]");
        boxingSelector(slime);
        System.out.println("                                        " +
                "[ SelectorDemo : boxingSelector() : 测试运动员：panda 是否有拳击比赛参赛资格 ]");
        boxingSelector(panda);
        System.out.println("                                        " +
                "[ SelectorDemo : boxingSelector() : 测试运动员：troll 是否有拳击比赛参赛资格 ]");
        boxingSelector(troll);
        System.out.println("                                        " +
                "[ SelectorDemo : boxingSelector() : 测试运动员：turtle 是否有拳击比赛参赛资格 ]");
        boxingSelector(turtle);
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Facade ----------------");
        FacadeDemo.facadeTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Memento ----------------");
        MementoDemo.mementoTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Iterator ----------------");

        ManCollection manCollection=new ManCollection(5);
        System.out.println("                                        " +
                "[ Iterator : appendMan() : 添加一个 SportsMan 实例 ]");
        manCollection.appendMan(new SportsMan("Healy",20));
        System.out.println("                                        " +
                "[ Iterator : appendMan() : 添加一个 SportsMan 实例 ]");
        manCollection.appendMan(new SportsMan("Gerald ",21));
        System.out.println("                                        " +
                "[ Iterator : appendMan() : 添加一个 SportsMan 实例 ]");
        manCollection.appendMan(new SportsMan("Trice ",56));
        System.out.println("                                        " +
                "[ Iterator : appendMan() : 添加一个 SportsMan 实例 ]");
        manCollection.appendMan(new SportsMan("Yennefa ",45));
        System.out.println("                                        " +
                "[ Iterator : appendMan() : 添加一个 SportsMan 实例 ]");
        manCollection.appendMan(new SportsMan("Kant ",18));

        System.out.println("                                        " +
                "[ Iterator : iterator() : 返回一个 Menuiterator 对象 ]");
        MenuIterator it=manCollection.iterator();
         // 迭代器遍历一个collection输出相关信息
        while (it.hasNext()) {
            System.out.println("                                        " +
                    "[ Iterator : next() : 返回下一个 SportsMan 对象 ]");
            SportsMan man = (SportsMan) it.next();
            System.out.println("姓名"+man.getName()+"年龄"+man.getAge());
        }

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Composite ----------------");

        Locker Ball=new Locker("球");

        Locker HollowBall=new Locker("空心球");

        System.out.println("                                        " +
                "[ composite : add() : 添加一个 Locker 对象 ]");
        Ball.add(HollowBall);

        Equipment basketball=new Equipment("篮球",120);
        Equipment football=new Equipment("足球",100);

         //在空心球这个划分下面添加具体的篮球和足球两个运动器材。
        System.out.println("                                        " +
                "[ composite : add() : 添加一个 Locker 对象（连续调用） ]");
        HollowBall.add(basketball).add(football);

        System.out.println("                                        " +
                "[ composite : printList() : 打印ball分类下的所有物品 ]");
        Ball.printList();
        System.out.println("");

        System.out.println("                                        " +
                "[ composite : getFullCategory() : 打印HollowBall被分类的路径 ]");
        HollowBall.getFullCategory();


        Equipment GymnasticsExhibitionBall=new Equipment("体操表演球",500);
        System.out.println("                                        " +
                "[ composite : add() : 添加一个 Equipment 对象 ]");
        HollowBall.add(GymnasticsExhibitionBall);

        Ball.printList();
        System.out.println("                                        " +
                "[ composite : getFullCategory() : 打印HollowBall被分类的路径 ]");
        GymnasticsExhibitionBall.getFullCategory();

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] MVC ----------------");

        SportsMan man;
        SportsManView testView=new SportsManView();

        System.out.println("                                        " +
                "[ Iterator : hasNext() : 判断集合中是否有下一个元素 ]");
        while (it.hasNext()) {
             // 利用controller来遍历所有的运动员，并且用View来打印输出运动员的信息。
            System.out.println("                                        " +
                    "[ Iterator : next() : 返回下一个 SportsMan 对象 ]");
            man = (SportsMan) it.next();
            SportsManController testController=new SportsManController(man,testView);

            System.out.println("                                        " +
                    "[ MVC : printDetails() : 打印 SportsMan 具体信息 ]");
            testController.printDetails(testController.getManName(),testController.getManAge());
        }
        System.out.println("                                        " +
                "[ Iterator : iterator() : 返回一个 Menuiterator 对象 ]");
        MenuIterator its=manCollection.iterator();
        System.out.println("                                        " +
                "[ Iterator : next() : 返回下一个 SportsMan 对象 ]");
        man = (SportsMan) its.next();

        SportsManController testController=new SportsManController(man,testView);
        System.out.println("----------------");
         // 利用controller来改变对应运动员的信息。
        System.out.println("                                        " +
                "[ MVC : printDetails() : 打印 SportsMan 具体信息 ]");
        testController.printDetails(testController.getManName(),testController.getManAge());


        System.out.println("----------------");
        System.out.println("                                        " +
                "[ MVC : setManAge() : 设置 SportsMan 年龄 ]");
        testController.setManAge(56);
        System.out.println("                                        " +
                "[ MVC : setManName() : 设置 SportsMan 姓名 ]");
        testController.setManName("HEARLY");
        System.out.println("                                        " +
                "[ MVC : printDetails() : 打印 SportsMan 具体信息 ]");
        testController.printDetails(testController.getManName(),testController.getManAge());

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] FrontController ----------------");

        FrontController start=new FrontController();
        //代表验证管理员身份
        System.out.println("                                        " +
                "[ FrontController : identityVerification() : 辨识使用者的身份 ]");
        start.identityVerification("root");
        System.out.println("");
        //代表验证运动员身份
        System.out.println("                                        " +
                "[ FrontController : identityVerification() : 辨识使用者的身份 ]");
        start.identityVerification("Healy");
        System.out.println("");

        //代表验证其他人身份
        System.out.println("                                        " +
                "[ FrontController : identityVerification() : 辨识使用者的身份 ]");
        start.identityVerification("people");
        System.out.println("");
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] TransferObject ----------------");
        System.out.println("PersonalInformation:PersonalInformation():创建用于传输的POJO信息类，以便一次性传输多种数据");
        System.out.println("Cat:Cat():创建使用传输POJO的实体运动员类");
        System.out.println("QuerySystem:QuerySystem():创建传输POJO的服务类");
        //录入个人信息
        ArrayList<String> sportEvents = new ArrayList<String>();
        sportEvents.add("baskerball");
        sportEvents.add("volleyball");
        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setAge(10);
        personalInformation.setEntryNumber(111);
        personalInformation.setGender("male");
        personalInformation.setName("Judy");
        personalInformation.setSportEvents(sportEvents);

        //新建运动员
        Cat Judy = new Cat(personalInformation);

        //创建查询对象
        QuerySystem querySystem = new QuerySystem();

        //进行查询
        System.out.println("                                        [ QuerySystem : query() : 利用QuerySystem.query()接收POJO并查询，随后返回POJO信息类]");
        querySystem.query(Judy.getPersonalInformation(), querySystem); //第一次查询不到创建
        querySystem.query(Judy.getPersonalInformation(), querySystem); //第二次查询到显示查询结果
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Strategy ----------------");
//        创建动物并进行进食、训练以及表演
        Rabbit rabbit = new Rabbit("兔斯基", "跑步");
        System.out.println("                                        [ Rabbit : eat() : 兔类进食策略 ]");
        rabbit.eat();
        Bird bird = new Bird("愤怒的小鸟", "竞速飞行");
        System.out.println("                                        [ Bird : eat() : 鸟类进食策略 ]");
        bird.eat();
        Fish fish = new Fish("小丑鱼", "花样游泳");
        System.out.println("                                        [ Fish : eat() : 鱼类进食策略 ]");
        fish.eat();
        System.out.println("                                        [ Rabbit : train() : 兔类训练策略 ]");
        rabbit.train();
        System.out.println("                                        [ Bird : train() : 鸟类训练策略 ]");
        bird.train();
        System.out.println("                                        [ Fish : train() : 鱼类训练策略 ]");
        fish.train();
        System.out.println("                                        [ Bird : perform() : 鸟类入场表演策略 ]");
        bird.perform();
        System.out.println("                                        [ Fish : train() : 鱼类入场表演策略 ]");
        fish.perform();
        System.out.println("                                        [ rabbit : perform() : 兔类入场表演策略 ]");
        rabbit.perform();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Decorator ----------------");
        System.out.println("InformationSenderForTennis:InformationSenderForTennis():创建网球基础比赛信息对象");
        System.out.println("FacebookInformationSender:sendInformation():发送信息");

        String message = "Peter has won the tennis game!";
        InformationSenderForTennis informationSenderForTennis = new InformationSenderForTennis();
        FacebookInformationSender facebookInformationSender = new FacebookInformationSender(informationSenderForTennis);
        TwitterInformationSender twitterInformationSender = new TwitterInformationSender(facebookInformationSender);

        System.out.println("                                        [ TwitterInformationSender : sendInformation() : 经过Twitter装饰后开始发送信息]");
        twitterInformationSender.sendInformation(message);
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Mediator ----------------");
        System.out.println("DispatchMediator:DispatchMediator():创建中介对象降低多个对象和类之间的通信复杂性");
        System.out.println("TennisCourt:TennisCourt():创建网球场对象");
        System.out.println("FootballCourt:FootballCourt():创建足球场对象");
        System.out.println("BasketballCourt:BasketballCourt():创建篮球场对象");

        DispatchMediator dispatchMediator = new DispatchMediator();
        TennisCourt tennisCourt = new TennisCourt(dispatchMediator);
        FootballCourt footballCourt = new FootballCourt(dispatchMediator);
        BasketballCourt basketballCourt = new BasketballCourt(dispatchMediator);

        dispatchMediator.setTennisCourt(tennisCourt);
        dispatchMediator.setFootballCourt(footballCourt);
        dispatchMediator.setBasketballCourt(basketballCourt);

        System.out.println("                                        [ TennisCourt : changeStartTime() : 网球场提出修改开始使用时间请求]");
        tennisCourt.changeStartTime("2");
        System.out.println("                                        [ TennisCourt : borrow() : 网球场向篮球场借用设备]");
        tennisCourt.borrow("BasketballCourt");
        System.out.println("                                        [ TennisCourt : borrow() : 足球场向篮球场借用设备]");
        footballCourt.borrow("BasketballCourt");

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- 美食广场场景构建 ----------------\n\n");


        System.out.println("---------------- [Pattern] Filter ----------------");
        DishesFilterDemo.dishesFilterTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("-------------- [Pattern] SimpleFactory --------------");
        SimpleFactoryDemo.runSimpleFactoryDemo();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Interpreter ----------------");
        System.out.println("欢迎光临动物竞赛园餐厅！");
        System.out.println("您点单的内容如下：");
        System.out.println("2份炒米饭，1份鲜草食，3份虫宴");
        String exp = "2 * "+ Const.FOOD_FRIEDRISE+" + 1 * "+Const.FOOD_GRASS+" + 3 * "+Const.FOOD_WORM;
        System.out.println("您应当付款：");
        try {
            System.out.println("                                        [ MatchExpression : match() : 接受表达式并进行语法树分析 ]");
            System.out.println("                                        [ MultipleExpression : interpret() : 完成左右元素的乘法操作 ]");
            System.out.println("                                        [ AddExpression : interpret() : 完成左右元素的加法操作 ]");

            System.out.println(MatchExpression.match(exp).interpret());
        } catch (MatchException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Converter ----------------");
        ConverterDemo.converterTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Adapter----------------");
        AdapterDemo adapterDemo = new AdapterDemo();
        adapterDemo.adapterTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Producer-Customer ----------------");

        Table table = new Table(2);
        System.out.println("                                        [ MakerThread : MakerThread(String name, Table table, long seed) : 实例化一个名为name的MakerThread，传入table实例，设定随机数种子seed ]");
        MakerThread m1 = new MakerThread("MakerThread-1",table,31415);
        System.out.println("                                        [ MakerThread : MakerThread(String name, Table table, long seed) : 实例化一个名为name的MakerThread，传入table实例，设定随机数种子seed ]");
        MakerThread m2 = new MakerThread("MakerThread-2",table,12345);
        System.out.println("                                        [ DrinkerThread : DrinkerThread(String name, Table table, long seed) : 实例化一个名为name的DrinkerThread，传入table实例，设定随机数种子seed ]");
        DrinkerThread d1 = new DrinkerThread("DrinkerThread-2",table,33333);
        System.out.println("                                        [ DrinkerThread : DrinkerThread(String name, Table table, long seed) : 实例化一个名为name的DrinkerThread，传入table实例，设定随机数种子seed ]");
        DrinkerThread d2 = new DrinkerThread("DrinkerThread-1",table,76536);
        try{
            m1.start();
            m2.start();
            d1.start();
            d2.start();
            m1.join();
            m2.join();
            d1.join();
            d2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- 比赛项目相关场景 ----------------\n\n");


        System.out.println("---------------- [Pattern] Template ----------------");
        TemplateDemo.templateTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] FlyWeight ----------------");
        FlyWeightDemo.flyWeightTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] NullObject ----------------");
        NullObjectDemo.runNullObjectDemo();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Observer ----------------");
        ObserverDemo.observerTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] StateDemo ----------------");
        StateDemo.runStateDemo();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Pipeline -----------------");
        PipelineDemo.pipelineTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] FactoryMethod ----------------");
        FactoryMethodDemo.runFactoryMethodDemo();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] AbstractFactory ----------------");
        AbstractFactoryDemo.runAbstractFactoryDemo();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] DirtyFlag ----------------");
//        设置队伍
        System.out.println("                                        [ RelayRaceTeam : RelayRaceTeam(String teamName, String name1, String name2, String name3" +
                " double speed1, double speed2, double speed3) : 创建接力比赛队伍 ]");
        RelayRaceTeam team1 = new RelayRaceTeam("一队", "熊大", "熊二", "小蜗",
                20, 30, 21);
        System.out.println("                                        [ RelayRaceTeam : RelayRaceTeam(...) : 创建接力比赛队伍，出错测试-速度小于零 ]");
        RelayRaceTeam team2 = new RelayRaceTeam("二队", "熊三", "熊四", "大蜗",
                23, 26, -5);
//        设置队伍列表
        ArrayList<RelayRaceTeam> relayRaceTeams = new ArrayList<>();
        relayRaceTeams.add(team1);
        relayRaceTeams.add(team2);
//        构造比赛类实例
        RelayRace relayRace = new RelayRace(relayRaceTeams);
//        开始比赛
        try {
            System.out.println("                                        [ RelayRace : start() : 开始接力比赛 ]");
            relayRace.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] ChainOfResponsibility ----------------");
        System.out.println("                                        " +
                "[ SetReferees : SetReferees() : 设置判罚责任链 ]");
        AbstractReferees referees = SetReferees.SetReferees("Unknown","Unknown",true);
        System.out.println("                                        " +
                "[ AbstractReferees : judgement() : 进行判罚 ]");
        referees.judgement();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] ExtensionObjects ----------------");
        Race race = new ConcreteRace();
        System.out.println("                                        " +
                "[ Race : GetExtension() : 获取扩展对象：伤停补时 ]");
        Overtime overtimeInjury = race.GetExtension("Injury");
        System.out.println("                                        " +
                "[ Race : GetExtension() : 获取扩展对象：平局加时 ]");
        Overtime overtimeDraw = race.GetExtension("Draw");
        System.out.println("                                        " +
                "[ Overtime : SetOvertime() : 设定伤停补时时间 ]");
        overtimeInjury.SetOvertime(5);
        System.out.println("                                        " +
                "[ Overtime : SetOvertime() : 设定平局加时时间 ]");
        overtimeDraw.SetOvertime(15);
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Balking ----------------");
        ArrayList<Vest> vestArrayList = new ArrayList<Vest>();
        for (int i = 0; i < 10; i++) {
            Vest vest = new Vest(i);
            vestArrayList.add(vest);
        }

        System.out.println("                                        [ ChangeThread : ChangeThread(String name, ArrayList<Vest> vestArrayList) : 构造一个名为name的线程，接受一个装有Vest对象的ArrayList ]");
        ChangeThread changeThread = new ChangeThread("Athlete",vestArrayList);
        System.out.println("                                        [ SaveThread : SaveThread(String name, ArrayList<Vest> vestArrayList) : 构造一个名为name的线程，接受一个装有Vest对象的ArrayList ]");
        SaveThread saveThread = new SaveThread("Saver",vestArrayList);
        try{
            changeThread.start();
            saveThread.start();
            changeThread.join();
            saveThread.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Callback ----------------");
        CallbackDemo.callbackTest();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] BusinessDelegate ----------------");
        System.out.println("QueryDelegate:QueryDelegate():创建查询委托对象做到表示层和业务层解耦");
        System.out.println("Dog:Dog():创建使用业务客户对象");

        try {
            QueryDelegate queryDelegate = new QueryDelegate(OfflineQuery.class.getName());
            queryDelegate.setQueryType();
            Dog dogAthlete = new Dog(queryDelegate);
            System.out.println("                                        [ Dog : doQuery() : Dog开始使用查询服务]");
            dogAthlete.doQuery();
        } catch (ClassNotFoundException e) {
            System.out.println("此查询类型不存在！");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Prototype ----------------");
        System.out.println("         ========= 类型1 - 浅克隆 =========");
        Athlete athlete1 = new Athlete("ALEX", "highJump");
        Athlete athlete2 = new Athlete("Cathy","highJump");
        Athlete athlete3 = new Athlete("Tim","highJump");
        Athlete athlete4 = new Athlete("Jerry","highJump");

        Certificate tmpCertificate = new Certificate(athlete1.getName(),athlete1.getSportsType(), AwardLevel.FPRSTPRIZE);
        System.out.println("                                        [ Certificate : printCertificate() : 打印奖状 ]");
        tmpCertificate.printCertificate();

        Certificate tmpCertificate2 = null;
        try {
            System.out.println("                                        [ Certificate : clone() : 克隆奖状(浅克隆) ]");
            tmpCertificate2 = (Certificate)tmpCertificate.clone();
            System.out.println("                                        [ Certificate : setName() : 设置奖状的姓名 ]");
            tmpCertificate2.setName(athlete2.getName());
            System.out.println("                                        [ Certificate : setPrizeLevel() : 设置奖状级别 ]");
            tmpCertificate2.setPrizeLevel(AwardLevel.SECONDPRIZE);

            System.out.println("                                        [ Certificate : clone() : 克隆奖状(浅克隆) ]");
            Certificate tmpCertificate3 = (Certificate)tmpCertificate.clone();
            System.out.println("                                        [ Certificate : setName() : 设置奖状的姓名 ]");
            tmpCertificate3.setName(athlete3.getName());
            System.out.println("                                        [ Certificate : setPrizeLevel() : 设置奖状级别 ]");
            tmpCertificate3.setPrizeLevel(AwardLevel.SECONDPRIZE);

            System.out.println("                                        [ Certificate : clone() : 克隆奖状(浅克隆) ]");
            Certificate tmpCertificate4 = (Certificate)tmpCertificate.clone();
            System.out.println("                                        [ Certificate : setName() : 设置奖状的姓名 ]");
            tmpCertificate4.setName(athlete4.getName());
            System.out.println("                                        [ Certificate : setPrizeLevel() : 设置奖状级别 ]");
            tmpCertificate4.setPrizeLevel(AwardLevel.THIRDPRIZE);

            System.out.println("                                        [ Certificate : printCertificate() : 打印奖状 ]");
            tmpCertificate2.printCertificate();
            System.out.println("                                        [ Certificate : printCertificate() : 打印奖状 ]");
            tmpCertificate3.printCertificate();
            System.out.println("                                        [ Certificate : printCertificate() : 打印奖状 ]");
            tmpCertificate4.printCertificate();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("");
        System.out.println("         ========= 类型2 - 深克隆 =========");

        Athlete athlete5 = new Athlete("ALEX", "highJump");
        Athlete athlete6 = new Athlete("Cathy","highJump");
        Athlete athlete7 = new Athlete("Tim","highJump");
        Athlete athlete8 = new Athlete("Jerry","highJump");

        prototypedeepcopy.Certificate tmpCertificate5 = new prototypedeepcopy.Certificate(athlete1.getName(),athlete1.getSportsType(), prototypedeepcopy.AwardLevel.FPRSTPRIZE);
        System.out.println("                                        [ Certificate : printCertificate() : 打印奖状 ]");
        tmpCertificate5.printCertificate();
        try{
            System.out.println("                                        [ Certificate : clone() : 克隆奖状(深克隆) ]");
            prototypedeepcopy.Certificate tmpCertificate6 = (prototypedeepcopy.Certificate)tmpCertificate5.clone();
            System.out.println("                                        [ Certificate : setName() : 设置奖状的姓名 ]");
            tmpCertificate6.setName(athlete2.getName());
            System.out.println("                                        [ Certificate : setPrizeLevel() : 设置奖状级别 ]");
            tmpCertificate6.setPrizeLevel(prototypedeepcopy.AwardLevel.SECONDPRIZE);

            System.out.println("                                        [ Certificate : clone() : 克隆奖状(深克隆) ]");
            prototypedeepcopy.Certificate tmpCertificate7 = (prototypedeepcopy.Certificate)tmpCertificate5.clone();
            System.out.println("                                        [ Certificate : setName() : 设置奖状的姓名 ]");
            tmpCertificate7.setName(athlete3.getName());
            System.out.println("                                        [ Certificate : setPrizeLevel() : 设置奖状级别 ]");
            tmpCertificate7.setPrizeLevel(prototypedeepcopy.AwardLevel.SECONDPRIZE);

            System.out.println("                                        [ Certificate : clone() : 克隆奖状(深克隆) ]");
            prototypedeepcopy.Certificate tmpCertificate8 = (prototypedeepcopy.Certificate)tmpCertificate5.clone();
            System.out.println("                                        [ Certificate : setName() : 设置奖状的姓名 ]");
            tmpCertificate8.setName(athlete4.getName());
            System.out.println("                                        [ Certificate : setPrizeLevel() : 设置奖状级别 ]");
            tmpCertificate8.setPrizeLevel(prototypedeepcopy.AwardLevel.THIRDPRIZE);

            System.out.println("                                        [ Certificate : printCertificate() : 打印奖状 ]");
            tmpCertificate6.printCertificate();
            System.out.println("                                        [ Certificate : printCertificate() : 打印奖状 ]");
            tmpCertificate7.printCertificate();
            System.out.println("                                        [ Certificate : printCertificate() : 打印奖状 ]");
            tmpCertificate8.printCertificate();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Bridge ----------------");
        try {
            System.out.println("                                        " +
                    "[ Medal : Medal(Material,sport) : 构造奖牌 ]");
            Medal myMedal=new Medal(Material.Gold,"Swimming");
            System.out.println("                                        " +
                    "[ Medal : printMedalInfo() : 打印奖牌信息 ]");
            myMedal.printMedalInfo();
            System.out.println("                                        " +
                    "[ Medal : Medal(Material,sport) : 构造奖牌 ]");
            myMedal=new Medal(Material.Silver,"Basketball");
            System.out.println("                                        " +
                    "[ Medal : printMedalInfo() : 打印奖牌信息 ]");
            myMedal.printMedalInfo();
            //异常输入测试
            myMedal=new Medal(Material.Silver,"???");
            myMedal.printMedalInfo();
        }
        catch (RuntimeException e){
            System.out.println("运动项目不存在");
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Immutable ----------------");
        try {
            ImmutableDemo.immutableTest();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Command ----------------");
        AwardMedalCommand command=new AwardMedalCommand(myPlayer,"Swimming", Material.Gold);
        System.out.println("                                        " +
                "[ command : execute() : 执行命令 ]");
        command.execute();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Proxy ----------------");
//        定义运动员列表
        ArrayList<Athlete> athletes = new ArrayList<>();
//        加入运动员
        athletes.add(new Athlete("Jerry", "跑步"));
        athletes.add(new Athlete("泡泡", "游泳"));
        athletes.add(new Athlete("Tom", "跳高"));
//        运动员代理类，用运动员列表初始化
        AthleteProxy athleteProxy = new AthleteProxy(athletes);
//        记者类
        Reporter reporter = new Reporter("丽塔");
//        问题数组
        String[] questions = {"你是谁？", "你有信心获胜吗？", "你想对你的支持者说些什么？"};
//        采访
        try {
            System.out.println("                                        [ Reporter : interview(AthleteProxy athleteProxy," +
                    " String interviewee, String[] questions) : 记者通过AthleteProxy间接采访对应Athlete ]");
            reporter.interview(athleteProxy, "Jerry", questions);
            System.out.println("                                        [ Reporter : interview(AthleteProxy athleteProxy," +
                    " String interviewee, String[] questions) : 记者通过AthleteProxy间接采访对应Athlete ]");
            reporter.interview(athleteProxy, "泡泡", questions);
            System.out.println("                                        [ Reporter : interview(...) : 出错测试-运动员名错误 ]");
            reporter.interview(athleteProxy, "李华", questions);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] WorkerThread ----------------");

        final CheckPoint checkPoint = new CheckPoint(99);
        System.out.println("                                        " +
                "[ CheckPoint : startVolunteer() : 启动所有志愿者线程 ]");
        checkPoint.startVolunteer();

        RunnerThread t1 = new RunnerThread("Nemo", checkPoint);
        RunnerThread t2 = new RunnerThread("Four", checkPoint);
        RunnerThread t3 = new RunnerThread("Wood", checkPoint);


        System.out.println("                                        " +
                "[ Thread : start() : 依次启动所有 Runner 线程 ]");
        System.out.println("                                        " +
                "[ Thread : join() : 并等待所有 Runner 线程执行结束 ]");
        try {
            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("                                        " +
                    "[ CheckPoint : stopVolunteer() : 停止所有志愿者线程 ]");
            checkPoint.stopVolunteer();
            System.out.println("------------------------ END ------------------------");
            System.out.println("");
        }
    }
}