package adapter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 20:49 2020/11/12
 * @Modified By:
 **/
public class Wechat extends Wepay implements Payment {

    private String id;
    private boolean loginStatus = false;

    @Override
    public boolean pay(double amount) {
        boolean payStatus = payment(amount);
        return payStatus;
    }

    @Override
    public boolean login(String id,String password){
        this.id=id;
        this.loginStatus=loginWechat(id,password);
        return this.loginStatus;
    }

    @Override
    public double getLimits(){
        return getTransactionLimits();
    }
}
