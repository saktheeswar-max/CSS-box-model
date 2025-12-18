package com.edutrack.controller;

import com.edutrack.dto.StudentDashboardResponse;
import com.edutrack.entity.Student;
import com.edutrack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // ✅ Add new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    // ✅ Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    // ✅ Delete student by ID
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }

    // ✅ Get student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    // ✅ Get student dashboard
    @GetMapping("/dashboard/{id}")
    public StudentDashboardResponse getDashboard(@PathVariable Long id) {
        return studentService.getDashboardData(id);
    }
}
