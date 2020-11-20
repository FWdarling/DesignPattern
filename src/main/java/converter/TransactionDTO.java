package converter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 15:21 2020/11/20
 * @Modified By:
 **/
public class TransactionDTO {
    String currencyType;

    double convertedAmount;

    String account;

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
