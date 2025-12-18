package com.edutrack.service;

import com.edutrack.dto.StudentDashboardResponse;
import com.edutrack.entity.Student;

import java.util.List;

public interface StudentService {

    // ✅ For Student Dashboard
    StudentDashboardResponse getDashboardData(Long studentId);

    // ✅ For StudentController CRUD
    Student save(Student student);

    List<Student> findAll();

    Student findById(Long id);

    void delete(Long id);
}
