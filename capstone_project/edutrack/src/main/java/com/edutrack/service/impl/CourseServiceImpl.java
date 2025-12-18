package com.edutrack.service.impl;

import com.edutrack.entity.Course;
import com.edutrack.repository.CourseRepository;
import com.edutrack.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository repo;

    @Override
    public Course save(Course course) {
        return repo.save(course);
    }

    @Override
    public List<Course> findAll() {
        return repo.findAll();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
