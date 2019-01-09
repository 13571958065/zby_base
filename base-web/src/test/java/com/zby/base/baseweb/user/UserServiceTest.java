package com.zby.base.baseweb.user;

import com.zby.base.baseweb.BaseWebApplication;
import com.zby.base.baseweb.BaseWebApplicationTests;
import com.zby.base.domain.user.User;
import com.zby.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith (SpringRunner.class)
@SpringBootTest(classes =BaseWebApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert() {
        User user = new User ();
        user.setId (1);
        user.setUserName ("小明");
        user.setPassword ("22222");
        userService.insert (user);
    }

    @Test
    public void deleteUserById() {
    }

    @Test
    public void updateUserById() {
    }

    @Test
    public void getUserById() {
    }

    @Test
    public void getUserByIds() {
    }
}