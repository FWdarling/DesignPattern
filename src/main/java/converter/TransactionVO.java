package converter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 15:21 2020/11/20
 * @Modified By:
 **/
public class TransactionVO {

    double amount;

    String targetCurrencyType;

    String account;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTargetCurrencyType() {
        return targetCurrencyType;
    }

    public void setTargetCurrencyType(String targetCurrencyType) {
        this.targetCurrencyType = targetCurrencyType;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
