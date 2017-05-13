package pres.haimi.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import pres.haimi.springboot.domain.City;
/**
 * Created by HaimiZhou on 2017/5/13.
 */

@Component
public class CityDubboConsumerService {
    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        String cityName="温岭";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }

}
