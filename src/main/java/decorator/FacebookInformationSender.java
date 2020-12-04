package decorator;

public class FacebookInformationSender extends InformationSender {
    private InformationSender informationSender;
    public FacebookInformationSender(InformationSender informationSender) {
        this.informationSender = informationSender;
    }

    /**
     * 发送信息
     * @param message 信息内容
     */
    @Override
    public void sendInformation(String message) {
        //获取相应的wrapper
        String wrapper = getWrapper("Facebook", message.length(), "#");

        System.out.println(wrapper);
        informationSender.sendInformation(message);
        System.out.println(wrapper);
    }
}
