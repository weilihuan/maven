package com.exp.master.web.service;

import java.util.List;
import com.exp.master.core.generic.GenericService;
import com.exp.master.web.model.Permission;

/**
 * 权限 业务接口
 * 
 * @author 覃班
 **/
public interface PermissionService extends GenericService<Permission, Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);

}
