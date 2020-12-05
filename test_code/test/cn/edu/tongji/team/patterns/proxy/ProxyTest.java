package proxy;

import cn.edu.tongji.team.model.beans.weather.Weather;
import cn.edu.tongji.team.model.beans.weather.WeatherType;
import cn.edu.tongji.team.model.realfactory.IConveyance;
import cn.edu.tongji.team.patterns.proxy.AbstractProxy;
import cn.edu.tongji.team.patterns.proxy.ConveyanceProxy;
import org.junit.Test;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 22:47 2020/12/4
 * @Modified By:
 **/
public class ProxyTest {
    @Test
    public void proxyTest(){
        AbstractProxy proxy = new ConveyanceProxy();
        IConveyance conveyance = (IConveyance)proxy.getProxyInstance();
        Weather weather = Weather.WEATHER;

        System.out.println("天气晴朗测试");
        weather.setWeatherType(WeatherType.Sunny);
        conveyance.conveyGoods();

        System.out.println("\n天气多云测试");
        weather.setWeatherType(WeatherType.Cloudy);
        conveyance.conveyGoods();

        System.out.println("\n天气下雨测试");
        weather.setWeatherType(WeatherType.Rainy);
        conveyance.conveyGoods();
    }
}
