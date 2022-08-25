package com.cy.store.mapper;

/**
 * @author luffe
 * @date 2022/8/24
 */

import com.cy.store.entity.User;

/** 用户模块的持久层接口*/
public interface UserMapper {
    /**
     * 插入用户的数据
     * @param user 用户的数据
     * @return 受影响的行数（增、删、改，都有受影响的行数作为返回值）
     */
    Integer insert(User user);

    /**
     * 根据用户名来查询用户的数据
     * @param username 用户名
     * @return 如果找到对应的用户，则返回该用户的数据，否则返回 null 值。
     */
    User findByUsername(String username);

}
