public class FacebookInformationSender extends InformationSender {
    private InformationSender informationSender;
    public FacebookInformationSender(InformationSender informationSender) {
        this.informationSender = informationSender;
    }

    @Override
    public void sendInformation(String message) {
        int messageLength = message.length();
        String symbols = "===========";
        int distance = messageLength - symbols.length() * 2;
        if (distance > 0) {
            for(int i = 0; i <= distance / 3; i ++) symbols += "=";
        }

        String wrapper = symbols + "Facebook" + symbols;
        System.out.println(wrapper);
        informationSender.sendInformation(message);
        System.out.println(wrapper);
    }
}
