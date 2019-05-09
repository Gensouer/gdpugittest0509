package net.togogo.mvnsbweb.controller;

import net.togogo.mvnsbweb.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public User sayHello(){
        User user = new User();
        user.setId(1);
        user.setName("qdd");
        user.setRole("java");
        return user;
    }

}
