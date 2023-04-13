package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class CourseController {

    @Resource
    private CourseService testService;

    @RequestMapping(value="/getCourseById")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "courseId", value = "课程id", dataType = "String",paramType = "query")
    )
    public List<Course> selectAll(String courseId){
        List<Course> courses = testService.selectAll(courseId);
        return courses;
    }
}
