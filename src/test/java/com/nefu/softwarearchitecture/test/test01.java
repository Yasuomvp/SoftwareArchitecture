package com.nefu.softwarearchitecture.test;


import com.nefu.softwarearchitecture.entiy.User;
import com.nefu.softwarearchitecture.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class test01 {

    @Autowired
    private UserMapper userMapper;


    @Test
    private void testSelect(){
        System.out.println("test strat!");
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
