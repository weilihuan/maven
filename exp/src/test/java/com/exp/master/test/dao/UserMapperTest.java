package com.exp.master.test.dao;

import java.util.List;
import javax.annotation.Resource;

import com.exp.master.core.feature.orm.mybatis.Page;
import com.exp.master.core.feature.test.TestSupport;
import com.exp.master.web.dao.UserMapper;
import com.exp.master.web.model.User;
import com.exp.master.web.model.UserExample;
import org.junit.Test;

public class UserMapperTest extends TestSupport {
    @Resource
    private UserMapper userMapper;

    @Test
    public void test_selectByExampleAndPage() {
        start();
        Page<User> page = new Page<>(1, 3);
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0L);
        final List<User> users = userMapper.selectByExampleAndPage(page, example);
        for (User user : users) {
            System.err.println(user);
        }
        end();
    }
}
