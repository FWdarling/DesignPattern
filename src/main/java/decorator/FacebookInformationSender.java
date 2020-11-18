package decorator;

public class FacebookInformationSender extends InformationSender {
    private InformationSender informationSender;
    public FacebookInformationSender(InformationSender informationSender) {
        this.informationSender = informationSender;
    }

    @Override
    public void sendInformation(String message) {
        //获取相应的wrapper
        String wrapper = getWrapper("Facebook", message.length(), "#");

        System.out.println(wrapper);
        informationSender.sendInformation(message);
        System.out.println(wrapper);
    }
}
