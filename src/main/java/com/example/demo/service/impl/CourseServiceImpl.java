package com.example.demo.service.impl;

import com.example.demo.entity.Course;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    /**
     *     根据课程id查课程信息
     */
    @Override
    public List<Course> getCourseById(String courseId) {
        List<Course> courses = courseMapper.getCourseById(courseId);
        return courses;
    }
}
