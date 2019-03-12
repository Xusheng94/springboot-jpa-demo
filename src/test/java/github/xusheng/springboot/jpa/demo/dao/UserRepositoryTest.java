package github.xusheng.springboot.jpa.demo.dao;

import github.xusheng.springboot.jpa.demo.SpringBootJpaDemoApplication;
import github.xusheng.springboot.jpa.demo.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description
 * @Author xusheng
 * @Create 2019-03-12 14:52
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootJpaDemoApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findUser() {
        List<User> users = userRepository.findUser("徐胜");
        Assert.assertTrue(users.size()>0);

    }
}