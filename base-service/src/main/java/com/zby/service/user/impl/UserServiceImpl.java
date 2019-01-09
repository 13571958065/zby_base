package com.zby.service.user.impl;

import com.zby.base.dao.user.UserMapper;
import com.zby.base.domain.user.User;
import com.zby.base.domain.user.UserExample;
import com.zby.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanglu
 * @date 2019/1/9 15:57
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert (user);
    }

    @Override
    public boolean deleteUserById(User user) {
        boolean flag = false;
        int success = userMapper.deleteByPrimaryKey (user.getId ( ));
        if (success > 0) {
            flag = true;
        }
        return flag;
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateByPrimaryKey (user);
    }

    @Override
    public User getUserById(User user) {
        return userMapper.selectByPrimaryKey (user.getId ());
    }

    @Override
    public List<User> getUserByIds(List<Integer> idList) {
        UserExample example = new UserExample ();
        UserExample.Criteria criteria = example.createCriteria ( );
        criteria.andIdIn (idList);
        List<User> users = userMapper.selectByExample (example);
        return users;
    }
}
