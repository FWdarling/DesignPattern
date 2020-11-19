package converter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 12:24 2020/11/13
 * @Modified By:
 **/
public class USD implements Converter{
    ExchangeRate exchangeRate;

    public USD(){
        exchangeRate=new ExchangeRate();
    }

    @Override
    public double fromRMB(double amount) {
        double rate= exchangeRate.getExchangeRateMap("USD");
        double usd=amount/rate;
        return usd;
    }

    @Override
    public double toRMB(double amount) {
        double rate=exchangeRate.getExchangeRateMap("USD");
        double rmb=amount*rate;
        return rmb;
    }
}
