package com.siva.Examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

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
