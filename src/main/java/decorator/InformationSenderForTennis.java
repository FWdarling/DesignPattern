public class InformationSenderForTennis extends InformationSender {
    @Override
    public void sendInformation(String message) {
        int messageLength = message.length();
        String symbols = "********"; //自动改变wrapper的长度以适应文本的长度
        int distance = messageLength - symbols.length() * 2;
        if (distance > 0) {
            for(int i = 0; i <= distance / 3; i ++) symbols += "*";
        }

        String wrapper = symbols + "TennisNews" + symbols;
        System.out.println(wrapper);
        System.out.println(message);
        System.out.println(wrapper);
    }
}
