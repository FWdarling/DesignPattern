package decorator;

import java.util.Collections;

public abstract class InformationSender {
    /**
     * 用来发送未经decorator修饰的信息
     * @param message 信息内容
     */
    public abstract void sendInformation(String message);

    /**
     *
     * @param centerName wrapper的标题
     * @param messageLength 需要wrapper的message的长度
     * @param symbol wrapper所用的符号
     * @return
     */
    public String getWrapper(String centerName, int messageLength, String symbol) {
        String symbols = String.join("", Collections.nCopies(9, symbol));
        int distance = messageLength - symbols.length() * 2;
        if (distance > 0) {
            for(int i = 0; i <= distance / 3; i ++) symbols += symbol;
        }

        String wrapper = symbols + centerName + symbols;
        return wrapper;
    }
}
