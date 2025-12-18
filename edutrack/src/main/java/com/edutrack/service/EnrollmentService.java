package com.edutrack.service;

import com.edutrack.entity.Enrollment;

import java.util.List;

public interface EnrollmentService {
    List<Enrollment> getAllEnrollments();
    Enrollment getEnrollmentById(Long id);
    Long getEnrollmentCount();
    Enrollment createEnrollment(Enrollment enrollment);
    void deleteEnrollment(Long id);
}
