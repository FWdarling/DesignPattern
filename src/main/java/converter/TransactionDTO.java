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

    /**
     Getter for currencyType

     Args:

     Return:
        String: the type of currency
     **/
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     Setter for currencyType

     Args:
     String currencyType

     Return:
     **/
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    /**
     Getter for amount of the transaction that has been converted.

     Args:

     Return:
        double:convertedAmount
     **/
    public double getConvertedAmount() {
        return convertedAmount;
    }

    /**
     Setter for the amount of the transaction that has been converted.

     Args:
        double convertedAmount

     Return:

     **/
    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    /**
     Getter for account information.

     Args:

     Return:
     String: account information.
     **/
    public String getAccount() {
        return account;
    }

    /**
     Setter for account information.

     Args:
     String: account information.

     Return:
     **/
    public void setAccount(String account) {
        this.account = account;
    }
}
