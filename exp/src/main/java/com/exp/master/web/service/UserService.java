package com.exp.master.web.service;

import com.exp.master.core.generic.GenericService;
import com.exp.master.web.model.User;

/**
 * 用户 业务 接口
 * 
 * @author 覃班
 **/
public interface UserService extends GenericService<User, Long> {

    /**
     * 用户验证
     * 
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     * 
     * @param username
     * @return
     */
    User selectByUsername(String username);
}
