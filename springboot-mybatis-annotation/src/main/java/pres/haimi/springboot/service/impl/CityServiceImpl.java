package pres.haimi.springboot.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pres.haimi.springboot.dao.CityDao;
import pres.haimi.springboot.domain.City;
import pres.haimi.springboot.service.CityService;

/**
 * 城市业务逻辑实现类
 *
 * Created by xchunzhao on 02/05/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
