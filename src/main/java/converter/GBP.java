package converter;

import converter.entity.ExchangeRate;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 12:26 2020/11/13
 * @Modified By:
 **/
public class GBP implements Converter{
    ExchangeRate exchangeRate;

    public GBP(){
        exchangeRate=new ExchangeRate();
    }

    @Override
    public double fromRMB(double amount) {
        double rate= exchangeRate.getExchangeRateMap("GBP");
        double gbp=amount/rate;
        return gbp;
    }

    @Override
    public double toRMB(double amount) {
        double rate=exchangeRate.getExchangeRateMap("GBP");
        double rmb=amount*rate;
        return rmb;
    }
}
