package com.exp.master.web.service;

import java.util.List;
import com.exp.master.core.generic.GenericService;
import com.exp.master.web.model.Role;

/**
 * 角色 业务接口
 * 
 * @author 覃班
 **/
public interface RoleService extends GenericService<Role, Long> {
    /**
     * 通过用户id 查询用户 拥有的角色
     * 
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);
}
