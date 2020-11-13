package converter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 11:56 2020/11/13
 * @Modified By:
 **/
public interface Converter {
    /**
     People getting involved in the sports event may come from different areas across the world,which makes people pay
     the bill with different currency. toRMB provides the function to convert other currency into RMB,which is used when
     animals exchange for RMB during the event.

     Args:
        amount: A double representing the amount of the original currency.

     return value:
        A double of the corresponding RMB amount.

     Examples:
     >>Converter converter = new Converter();
     >>double EUR = 100
     >>double RMB=converter.toRMB(EUR);
     **/
    double toRMB(double amount);

    /**
     Transactions in the sports event may be asked to use RMB. However animals from different areas only possess other
     concurrency than RMB, so RMB should be converted into the concurrecy of other types.

     Args:
        amount: A double representing the amount of the RMB.

     return value:
        A double of the corresponding amount of other concurrency.

     **/
    double fromRMB(double amount);
}
