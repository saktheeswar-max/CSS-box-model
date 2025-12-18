package com.edutrack.service.impl;

import com.edutrack.dto.StudentDashboardResponse;
import com.edutrack.entity.Student;
import com.edutrack.repository.AttendanceRepository;
import com.edutrack.repository.EnrollmentRepository;
import com.edutrack.repository.MarkRepository;
import com.edutrack.repository.StudentRepository;
import com.edutrack.repository.TimetableRepository;
import com.edutrack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private MarkRepository markRepository;

    @Autowired
    private TimetableRepository timetableRepository;

    @Override
    public StudentDashboardResponse getDashboardData(Long studentId) {

        // ✅ Total courses enrolled (correct repository)
        int totalCourses = enrollmentRepository.countByStudentId(studentId);

        // ✅ Attendance percentage
        Double attendancePercentage = attendanceRepository.calculateAttendancePercentage(studentId);
        if (attendancePercentage == null) attendancePercentage = 0.0;

        // ✅ Average marks
        Double averageMarks = markRepository.calculateAverageMarks(studentId);
        if (averageMarks == null) averageMarks = 0.0;

        // ✅ Timetable entries (correct logic)
        int timetableCount = timetableRepository.countByStudentId(studentId);

        return new StudentDashboardResponse(
                totalCourses,
                attendancePercentage,
                averageMarks,
                timetableCount
        );
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
