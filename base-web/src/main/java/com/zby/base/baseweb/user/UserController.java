package com.zby.base.baseweb.user;

import com.zby.base.domain.user.User;
import com.zby.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanglu
 * @date 2019/1/9 16:10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    //http://localhost:8080/base-web/user/id?id=1
    @RequestMapping(value = "/id")
    public @ResponseBody User getUserById(User user) {
        User userById = userService.getUserById (user);
        return userById;
    }

}
