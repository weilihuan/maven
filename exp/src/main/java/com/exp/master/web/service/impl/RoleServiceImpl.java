package com.exp.master.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.exp.master.core.generic.GenericDao;
import com.exp.master.core.generic.GenericServiceImpl;
import org.springframework.stereotype.Service;
import com.exp.master.web.dao.RoleMapper;
import com.exp.master.web.model.Role;
import com.exp.master.web.service.RoleService;

/**
 * 角色Service实现类
 *
 * @author 覃班
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
