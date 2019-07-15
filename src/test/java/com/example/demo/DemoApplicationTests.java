package com.example.demo;

import com.example.demo.domian.Users;
import com.example.demo.mapper.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void contextLoads() {
        List<Users> users = usersMapper.selectByPrimaryKey(19);
        users.forEach(eo -> eo.getCreatedAt());
        System.out.println(users);
    }

}
