package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "获取课程信息")
@RestController
@RequestMapping("/courseInfo")
public class CourseController {

    @Resource
    private CourseService courseService;

    @ApiOperation("通过ID获取课程信息")
    @GetMapping(value="/getCourseById")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "courseId", value = "课程id", dataType = "String",paramType = "query")
    )
    public List<Course> getCourseById(String courseId){
        return courseService.getCourseById(courseId);
    }
}
