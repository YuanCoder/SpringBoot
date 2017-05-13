package pres.haimi.springboot.dao.cluster;

import pres.haimi.springboot.domain.City;


/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */

public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(String cityName);
}
