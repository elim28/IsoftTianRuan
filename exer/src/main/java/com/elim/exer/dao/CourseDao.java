package com.elim.exer.dao;

import com.elim.exer.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseDao {
    /**
     * 获取所有数据
     */

    @Select("select * from tb_course")
    List<Course> getAll();
}
