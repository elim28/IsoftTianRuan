package com.isoft.testmybatis.dao;

import com.isoft.testmybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.Date;

@Mapper
public interface UserDao {
//-- select 根据用户名和密码查找用户
    @Select("select * from tb_user where name=#{uname} and password=#{pwd}")
    User select(@Param("uname") String name, @Param("pwd") String password);
//-- select 用户名是否存在0
    @Select("select count(*) from tb_user where name=#{uname}")
    int nameSearch(@Param("uname") String name);
//-- select 邮箱是否存在
    @Select("select count(*) from tb_user where email=#{email}")
    int emailSearch(String email);
//-- insert 添加用户
    @Insert("insert into tb_user(name, password, regdatetime, status, photourl, email, mobile, activecode) values(#{name}, #{password}, now(), 0, #{photourl}, #{email}, #{mobile}, #{activecode})")
    int add(User user);
//-- select 根据id，验证密码
    @Select("select password from tb_user where id=#{id}")
    String passwordByid(Integer id);
//-- update 根据id，修改密码
    @Update("update tb_user set password=#{password} where id=#{id}")
    int updatePwd(@Param("id") Integer id, @Param("password") String password);
//-- update 根据id，修改头像url
    @Update("update tb_user set photourl=#{photourl} where id=#{id}")
    int updateUrl(@Param("id") Integer id, @Param("photourl") String photourl);
//-- update 根据id，修改电话
    @Update("update tb_user set mobile=#{mobile} where id=#{id}")
    int updateMobile(@Param("id") Integer id, @Param("mobile") String mobile);
//-- update 根据id，修改状态
    @Update("update tb_user set status=#{status} where id=#{id}")
    int updateStatus(@Param("id") Integer id, @Param("status") Integer status);

}
