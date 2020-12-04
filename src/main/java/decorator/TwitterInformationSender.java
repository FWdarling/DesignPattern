package decorator;

public class TwitterInformationSender extends InformationSender {
    private InformationSender informationSender;
    public TwitterInformationSender(InformationSender informationSender) {
        this.informationSender = informationSender;
    }
    @Override
    /**
     * 发送信息
     */
    public void sendInformation(String message) {
        //获取相应的wrapper
        String wrapper = getWrapper("Twitter", message.length(), "#");

        System.out.println(wrapper);
        informationSender.sendInformation(message);
        System.out.println(wrapper);
    }
}
