package com.exp.master.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.exp.master.core.generic.GenericDao;
import com.exp.master.core.generic.GenericServiceImpl;
import org.springframework.stereotype.Service;
import com.exp.master.web.dao.PermissionMapper;
import com.exp.master.web.model.Permission;
import com.exp.master.web.service.PermissionService;

/**
 * 权限Service实现类
 *
 * @author 覃班
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
