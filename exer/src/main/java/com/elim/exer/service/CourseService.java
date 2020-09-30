package com.elim.exer.service;

import com.elim.exer.dao.CourseDao;
import com.elim.exer.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public List<Course> getAll() {
        return courseDao.getAll();
    }
}
