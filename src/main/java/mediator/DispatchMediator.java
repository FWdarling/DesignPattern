package mediator;

public class DispatchMediator extends Mediator {
    public void setTennisCourt(TennisCourt t1) {this.tennisCourt = t1;}
    public void setFootballCourt(FootballCourt t2) {this.footballCourt = t2;}
    public void setBasketballCourt(BasketballCourt t3) {this.basketballCourt = t3;}

    /**
     * 中介接收到信息，开始处理内部的各个类的交互
     * @param info 接受的具体信息指令
     * @param content 接受指令的内容
     */
    @Override
    public void doNotify(String info, String content) {
        switch (info.charAt(0)) {
            //开始改变场地使用时间
            case 'C':
                System.out.println("==============================================");
                System.out.printf("场地分配中介收到%s的请求,场地开始使用时间为:%s pm\n", info, content);
                System.out.println("==============================================");
                break;
            //开始借用content所代表的场地的设备
            case 'B':
                char tmp = content.charAt(0);
                //通过被借用者的首字母判断被借用者的身份
                String borrower = String.valueOf(tmp).toUpperCase();
                info = info.substring(1);
                switch (borrower) {
                    case "T":
                        tennisCourt.lend(info);
                        break;
                    case "F":
                        footballCourt.lend(info);
                        break;
                    case "B":
                        basketballCourt.lend(info);
                        break;
                }
        }
    }
}
