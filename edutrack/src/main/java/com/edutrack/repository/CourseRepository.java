package com.edutrack.repository;

import com.edutrack.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // Built-in methods:
    // long count();
    // List<Course> findAll();
    // Optional<Course> findById(Long id);
    // Course save(Course course);

    // If you ever need by code:
    // Course findByCode(String code);
}
