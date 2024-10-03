package com.siva.Examples;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void test() {
        Optional<User> u = userService.getUserById("12");
        assert u != null;

    }

    @Test
    void test2() {
        User u = new User();
        u.setId("1");
        userService.saveUser(u);

    }

    @Test
    void test3() {
        User u = new User();
        u.setId("1");
        userService.deleteUser(u);
    }




}
