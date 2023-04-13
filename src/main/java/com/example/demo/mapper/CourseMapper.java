package com.example.demo.mapper;

import com.example.demo.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {

    /**
     * 根据课程id查课程信息
     */
    List<Course> getCourseById(String courseId);
}
