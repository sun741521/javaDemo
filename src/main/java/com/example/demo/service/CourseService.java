package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> selectAll(String courseId);
}
