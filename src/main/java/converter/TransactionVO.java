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

    /**
     Getter for the amount of the transaction.

     Args:

     Return:
        double amount

     **/
    public double getAmount() {
        return amount;
    }

    /**
     Setter for the amount of the transaction.

     Args:
        double amount

     Return:
     **/
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     Getter for the type of currency that is desired.

     Args:


     Return:
        String targetCurrencyType

     **/
    public String getTargetCurrencyType() {
        return targetCurrencyType;
    }

    /**
     Setter for the type of currency that is desired.

     Args:
        String targetCurrencyType

     Return:
     **/
    public void setTargetCurrencyType(String targetCurrencyType) {
        this.targetCurrencyType = targetCurrencyType;
    }

    /**
     Getter for the account information.

     Args:


     Return:
     String account

     **/
    public String getAccount() {
        return account;
    }


    /**
     Setter for the account information.

     Args:
     String account

     Return:
     **/
    public void setAccount(String account) {
        this.account = account;
    }
}
