package com.isoft.testmybatis;

import com.isoft.testmybatis.dao.UserDao;
import com.isoft.testmybatis.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.util.UUID;

@SpringBootTest
class TestMybatisApplicationTests {
    @Autowired
    UserDao userDao;


    @Test
    void contextLoads() {
//        System.out.println(userDao.select("张三","202cb962ac59075b964b07152d234b70"));
//        System.out.println(userDao.nameSearch("张三"));
//        User user = new User();
//        user.setName("里斯");
//        user.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
//        user.setPhotourl("http://myphoto.com");
//        user.setEmail("12516548165@gmail.com");
//        user.setMobile("15846975284");
//        user.setActivecode(UUID.randomUUID().toString().replaceAll("-",""));
//        System.out.println(userDao.add(user));
//        System.out.println(userDao.passwordByid(2));
        System.out.println(userDao.updatePwd(2,DigestUtils.md5DigestAsHex("654321".getBytes())));
        System.out.println(userDao.updateMobile(2,"11111111111"));
        System.out.println(userDao.updateUrl(2,"http://1111111111@163.com"));
        System.out.println(userDao.updateStatus(2,1));

    }


}
