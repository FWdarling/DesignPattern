package decorator;

public class InformationSenderForTennis extends InformationSender {
    @Override
    /**
     * 发送信息
     */
    public void sendInformation(String message) {
        //获取相应的wrapper
        String wrapper = getWrapper("Tennisnews", message.length(), "*");

        System.out.println(wrapper);
        System.out.println(message);
        System.out.println(wrapper);
    }
}
