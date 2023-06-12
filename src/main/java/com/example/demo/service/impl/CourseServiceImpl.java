package com.example.demo.service.impl;

import com.example.demo.entity.Course;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Resource
    private RedisTemplate redisTemplate;

    /**
     *     根据课程id查课程信息
     */
    @Override
    public List<Course> getCourseById(String courseId) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        redisTemplate.opsForValue().set("second","i am fine",30, TimeUnit.SECONDS);
        List<Course> courses = courseMapper.getCourseById(courseId);
        return courses;
    }
}
