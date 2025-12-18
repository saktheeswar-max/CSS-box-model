package com.edutrack.service;

import com.edutrack.entity.Course;

import java.util.List;

public interface CourseService {

    Course save(Course course);

    List<Course> findAll();

    void delete(Long id);
}
