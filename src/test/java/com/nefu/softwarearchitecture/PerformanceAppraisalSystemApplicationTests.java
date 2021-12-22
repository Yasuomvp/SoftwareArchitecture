package com.nefu.softwarearchitecture;

import com.nefu.softwarearchitecture.mapper.RoleMapper;
import com.nefu.softwarearchitecture.mapper.UserMapper;
import com.nefu.softwarearchitecture.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PerformanceAppraisalSystemApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.findByUsername("rick"));
    }

    @Test
    void test01(){
        System.out.println(roleMapper.findRolesByUsername("rick"));
    }
}
