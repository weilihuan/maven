package com.exp.master.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.exp.master.core.generic.GenericDao;
import com.exp.master.core.generic.GenericServiceImpl;
import org.springframework.stereotype.Service;
import com.exp.master.web.dao.UserMapper;
import com.exp.master.web.model.User;
import com.exp.master.web.model.UserExample;
import com.exp.master.web.service.UserService;

/**
 * 用户Service实现类
 *
 * @author 覃班
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }

    @Override
    public int update(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }

}
