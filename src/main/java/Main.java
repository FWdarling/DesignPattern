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
import chainofresponsibility.SetRefereees;
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
            thread.run();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


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
        System.out.println("");


        System.out.println("---------------- [Pattern] Visitor ----------------");
        System.out.println("利用visitor模式为多个类提供多种方法");
        System.out.println("此时有4座形状不同的建筑物，求出他们的周长和面积");

        // 一个含有5个元素的List，包含三种不同的形状
        List<Element> shapes = new ArrayList<Element>();
        shapes.add(new Triangle(1.3, 2.2, 3.1));
        shapes.add(new Circle(1.2));
        shapes.add(new Triangle(2.4, 3.3, 4.2));
        //shapes.add(new Rectangle(2.1, 3.2));
        shapes.add(new Circle(5.6));

        // 计算周长和面积的不同策略（访问者）
        Perimeter perimeter = new Perimeter();
        Area area = new Area();

        // 将周长和面积的计算策略传入（接受不同访问者的访问）
        for (Element shape : shapes) {
            System.out.printf("周长 : %5.2f\t 面积 : %5.2f\n", shape.accept(perimeter), shape.accept(area));
        }
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
        stadiumDirector.setStadiumBuilder(racingTrackBuilder);

        stadiumDirector.CompetitionAreaCount(-3).SpectatorAreaCount(14).constructStadium();

        stadiumDirector.setStadiumBuilder(flyingVenueBuilder);
        stadiumDirector.SpectatorAreaCount(-3).constructStadium();

        stadiumDirector.setStadiumBuilder(swimmingPoolBuilder);
        stadiumDirector.CompetitionAreaCount(20).SpectatorAreaCount(12).constructStadium();

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Multiton ----------------");
        RoomDistributor roomDistributor = new RoomDistributor();
        TrainingRoom trainingRoom1 = roomDistributor.applyRoom();
        TrainingRoom trainingRoom2 = roomDistributor.applyRoom();
        TrainingRoom trainingRoom3 = roomDistributor.applyRoom();
        TrainingRoom trainingRoom4 = roomDistributor.applyRoom();
        trainingRoom1.showRoom();
        trainingRoom2.showRoom();
        trainingRoom3.showRoom();
        trainingRoom2.repayRoom();
        trainingRoom4 = roomDistributor.applyRoom();
        trainingRoom4.showRoom();
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

        system.addAlarm(carnivoreAreaAlarm);
        system.addAlarm(herbivoreAreaAlarm);
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

        boxingSelector(slime);
        boxingSelector(panda);
        boxingSelector(troll);
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
        manCollection.appendMan(new SportsMan("Healy",20));
        manCollection.appendMan(new SportsMan("Gerald ",21));
        manCollection.appendMan(new SportsMan("Trice ",56));
        manCollection.appendMan(new SportsMan("Yennefa ",45));
        manCollection.appendMan(new SportsMan("Kant ",18));

        MenuIterator it=manCollection.iterator();
         // 迭代器遍历一个collection输出相关信息
        while (it.hasNext()) {
            SportsMan man = (SportsMan) it.next();
            System.out.println("姓名"+man.getName()+"年龄"+man.getAge());
        }

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Composite ----------------");

        Locker Ball=new Locker("球");

        Locker HollowBall=new Locker("空心球");
        Ball.add(HollowBall);

        Equipment basketball=new Equipment("篮球",120);
        Equipment football=new Equipment("足球",100);

         //在空心球这个划分下面添加具体的篮球和足球两个运动器材。
        HollowBall.add(basketball).add(football);


        Ball.printList();
        System.out.println("");
        HollowBall.getFullCategory();


        Equipment GymnasticsExhibitionBall=new Equipment("体操表演球",500);
        HollowBall.add(GymnasticsExhibitionBall);

        Ball.printList();
        System.out.println("");
        GymnasticsExhibitionBall.getFullCategory();

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] MVC ----------------");

        SportsMan man;
        SportsManView testView=new SportsManView();

        while (it.hasNext()) {
             // 利用controller来遍历所有的运动员，并且用View来打印输出运动员的信息。
            man = (SportsMan) it.next();
            SportsManController testController=new SportsManController(man,testView);

            testController.printDetails(testController.getManName(),testController.getManAge());
        }

        MenuIterator its=manCollection.iterator();
        man = (SportsMan) its.next();
        SportsManController testController=new SportsManController(man,testView);
        System.out.println("----------------");
         // 利用controller来改变对应运动员的信息。
        testController.printDetails(testController.getManName(),testController.getManAge());


        System.out.println("----------------");
        testController.setManAge(56);
        testController.setManName("HEARLY");

        testController.printDetails(testController.getManName(),testController.getManAge());

        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] FrontController ----------------");

        FrontController start=new FrontController();
        //代表验证管理员身份
        start.identityVerification("root");
        System.out.println("");
        //代表验证运动员身份
        start.identityVerification("Healy");
        System.out.println("");

        //代表验证其他人身份
        start.identityVerification("people");
        System.out.println("");
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] TransferObject ----------------");
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
        querySystem.query(Judy.getPersonalInformation(), querySystem); //第一次查询不到创建
        querySystem.query(Judy.getPersonalInformation(), querySystem); //第二次查询到显示查询结果
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Strategy ----------------");
//        创建动物并进行进食、训练以及表演
        Rabbit rabbit = new Rabbit("兔斯基", "跑步");
        rabbit.eat();
        Bird bird = new Bird("愤怒的小鸟", "竞速飞行");
        bird.eat();
        Fish fish = new Fish("小丑鱼", "花样游泳");
        fish.eat();
        rabbit.train();
        bird.train();
        fish.train();
        bird.perform();
        fish.perform();
        rabbit.perform();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Decorator ----------------");
        String message = "Peter has won the tennis game!";
        InformationSenderForTennis informationSenderForTennis = new InformationSenderForTennis();
        FacebookInformationSender facebookInformationSender = new FacebookInformationSender(informationSenderForTennis);
        TwitterInformationSender twitterInformationSender = new TwitterInformationSender(facebookInformationSender);
        twitterInformationSender.sendInformation(message);
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Mediator ----------------");
        DispatchMediator dispatchMediator = new DispatchMediator();
        TennisCourt tennisCourt = new TennisCourt(dispatchMediator);
        FootballCourt footballCourt = new FootballCourt(dispatchMediator);
        BasketballCourt basketballCourt = new BasketballCourt(dispatchMediator);

        dispatchMediator.setTennisCourt(tennisCourt);
        dispatchMediator.setFootballCourt(footballCourt);
        dispatchMediator.setBasketballCourt(basketballCourt);

        tennisCourt.changeStartTime("2");
        tennisCourt.borrow("BasketballCourt");
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
        MakerThread m1 = new MakerThread("MakerThread-1",table,31415);
        MakerThread m2 = new MakerThread("MakerThread-2",table,12345);
        DrinkerThread d1 = new DrinkerThread("DrinkerThread-2",table,33333);
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
        RelayRaceTeam team1 = new RelayRaceTeam("一队", "熊大", "熊二", "小蜗",
                20, 30, -1);
        RelayRaceTeam team2 = new RelayRaceTeam("二队", "熊三", "熊四", "大蜗",
                23, 26, 27);
//        设置队伍列表
        ArrayList<RelayRaceTeam> relayRaceTeams = new ArrayList<>();
        relayRaceTeams.add(team1);
        relayRaceTeams.add(team2);
//        构造比赛类实例
        RelayRace relayRace = new RelayRace(relayRaceTeams);
//        开始比赛
        try {
            relayRace.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] ChainOfResponsibility ----------------");
        AbstractReferees referees = SetRefereees.SetRefereees("Unknown","Unknown",true);
        referees.judgement();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] ExtensionObjects ----------------");
        Race race = new ConcreteRace();
        Overtime overtimeInjury = race.GetExtension("Injury");
        Overtime overtimeDraw = race.GetExtension("Draw");
        overtimeInjury.SetOvertime(5);
        overtimeDraw.SetOvertime(15);
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Balking ----------------");
        ArrayList<Vest> vestArrayList = new ArrayList<Vest>();
        for (int i = 0; i < 10; i++) {
            Vest vest = new Vest(i);
            vestArrayList.add(vest);
        }

        ChangeThread changeThread = new ChangeThread("Athlete",vestArrayList);
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
        try {
            QueryDelegate queryDelegate = new QueryDelegate(OfflineQuery.class.getName());
            queryDelegate.setQueryType();
            Dog dogAthlete = new Dog(queryDelegate);
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
        Athlete athlete1 = new Athlete("ALEX", "highJump");
        Athlete athlete2 = new Athlete("Cathy","highJump");
        Athlete athlete3 = new Athlete("Tim","highJump");
        Athlete athlete4 = new Athlete("Jerry","highJump");

        Certificate tmpCertificate = new Certificate(athlete1.getName(),athlete1.getSportsType(), AwardLevel.FPRSTPRIZE);
        tmpCertificate.printCertificate();

        Certificate tmpCertificate2 = null;
        try {
            tmpCertificate2 = (Certificate)tmpCertificate.clone();
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
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] Bridge ----------------");
        try {
            Medal myMedal=new Medal(Material.Gold,"Swimming");
            myMedal.printMedalInfo();
            myMedal=new Medal(Material.Silver,"Basketball");
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


        System.out.println("---------------- [Pattern] Command ----------------");
        AwardMedalCommand command=new AwardMedalCommand(myPlayer,"Swimming", Material.Gold);
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
            reporter.interview(athleteProxy, "Jerry", questions);
            reporter.interview(athleteProxy, "泡泡", questions);
            reporter.interview(athleteProxy, "李华", questions);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");


        System.out.println("---------------- [Pattern] WorkerThread ----------------");

        final CheckPoint checkPoint = new CheckPoint(99);
        checkPoint.startVolunteer();

        RunnerThread t1 = new RunnerThread("Nemo", checkPoint);
        RunnerThread t2 = new RunnerThread("Four", checkPoint);
        RunnerThread t3 = new RunnerThread("Wood", checkPoint);

        // 开始并等待所有 Runner 线程结束
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
            // 手动结束所有的 Volunteer 线程
            checkPoint.stopVolunteer();
            System.out.println("------------------------ END ------------------------");
            System.out.println("");
        }
    }
}