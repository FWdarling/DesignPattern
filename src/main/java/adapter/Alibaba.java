package adapter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 20:43 2020/11/12
 * @Modified By:
 **/
public class Alibaba extends Alipay implements Payment{

    private String id;
    private boolean loginStatus=false;

    public boolean pay(double amount){

        boolean payStatus=payBill(id,amount);
        if(payStatus) {
            return true;
        }
        else{
            return false;
        }

    }

    public boolean login(String id,String password){
        this.id=id;
        this.loginStatus=validation(id,password);
        return this.loginStatus;
    }
}
