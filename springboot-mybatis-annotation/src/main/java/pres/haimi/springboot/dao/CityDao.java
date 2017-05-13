package pres.haimi.springboot.dao;

import org.apache.ibatis.annotations.*;
import pres.haimi.springboot.domain.City;


/**
 * 城市 DAO 接口类
 *
 * Created by xchunzhao on 02/05/2017.
 */
@Mapper
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    @Select("SELECT * FROM city")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    City findByName(@Param("cityName") String cityName);
}
