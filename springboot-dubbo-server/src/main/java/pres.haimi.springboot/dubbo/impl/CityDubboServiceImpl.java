package pres.haimi.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import pres.haimi.springboot.domain.City;
import pres.haimi.springboot.dubbo.CityDubboService;

/**
 * Created by HaimiZhou on 2017/5/13.
 */

//注册为dubbo服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService{
    public City findCityByName(String cityName) {
        return new City(1L,2L,"温岭","是我的故乡");
    }
}
