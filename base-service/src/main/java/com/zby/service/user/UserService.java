package com.zby.service.user;

import com.zby.base.domain.user.User;

import java.util.List;

/**
 * @author yanglu
 * @date 2019/1/9 15:51
 */
public interface UserService {

    void insert(User user);

    boolean deleteUserById(User user);

    void updateUserById(User user);

    User getUserById(User user);

    List<User> getUserByIds(List<Integer> idList);
}
