package converter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 12:09 2020/11/13
 * @Modified By:
 **/
public class EUR implements Converter{

    ExchangeRate exchangeRate;

    public EUR(){
        exchangeRate=new ExchangeRate();
    }

    @Override
    public double fromRMB(double amount) {
        double rate= exchangeRate.getExchangeRateMap("EUR");
        double eur=amount/rate;
        return eur;
    }

    @Override
    public double toRMB(double amount) {
        double rate=exchangeRate.getExchangeRateMap("EUR");
        double rmb=amount*rate;
        return rmb;
    }
}
