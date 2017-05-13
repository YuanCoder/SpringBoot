package pres.haimi.springboot.dao;


import pres.haimi.springboot.domain.City;

/**
 * Created by HaimiZhou on 2017/5/10.
 */
public interface CityDao {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(String cityName);
}
