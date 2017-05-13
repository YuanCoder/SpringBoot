package pres.haimi.springboot.dao.master;

import pres.haimi.springboot.domain.User;

/**
 * 用户 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */

public interface UserDao {

    /**
     * 根据用户名获取用户信息
     *
     * @param userName
     * @return
     */
    User findByName(String userName);
}
