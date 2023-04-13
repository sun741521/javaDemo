package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {
    /**
     *   根据课程id查课程信息
     */
    List<Course> getCourseById(String courseId);
}
