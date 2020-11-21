package entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 12:11 2020/11/13
 * @Modified By:
 **/
public class ExchangeRate {
    private Map<String, Double> exchangeRateMap=new HashMap<String, Double>();

    public double getExchangeRateMap(String concurrency) {
        return exchangeRateMap.get(concurrency);
    }


    public ExchangeRate(){
        exchangeRateMap.put("EUR",7.817);
        exchangeRateMap.put("USD",6.622);
        exchangeRateMap.put("GBP",8.686);
    }
}
