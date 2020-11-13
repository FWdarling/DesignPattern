public class DispatchMediator extends Mediator {
    public void setTennisCourt01(TennisCourt01 t1) {this.tennisCourt01 = t1;}
    public void setTennisCourt02(TennisCourt02 t2) {this.tennisCourt02 = t2;}
    public void setTennisCourt03(TennisCourt03 t3) {this.tennisCourt03 = t3;}

    /**
     * 中介接收到信息，开始处理内部的各个类的交互
     * @param info 接受的具体信息指令
     * @param content 接受指令的内容
     */
    @Override
    public void doNotify(String info, int content) {
        switch (info.charAt(0)) {
            case 'C':
                System.out.println("==============================================");
                System.out.printf("场地分配中介收到%s的请求,场地开始使用时间为:%d pm\n", info, content);
                System.out.println("==============================================");
                break;
            case 'B':
                String borrower = info.split(":")[1];
                switch (content) {
                    case 1:
                        tennisCourt01.lend(Integer.parseInt(borrower));
                        break;
                    case 2:
                        tennisCourt02.lend(Integer.parseInt(borrower));
                        break;
                    case 3:
                        tennisCourt03.lend(Integer.parseInt(borrower));
                        break;
                }
        }
    }
}
