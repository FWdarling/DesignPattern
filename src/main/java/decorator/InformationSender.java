public abstract class InformationSender {
    /**
     * 用来发送未经decorator修饰的信息
     * @param message 信息内容
     */
    public abstract void sendInformation(String message);
}
