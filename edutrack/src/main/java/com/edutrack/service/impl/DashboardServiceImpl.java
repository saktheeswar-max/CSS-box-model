package com.edutrack.service.impl;

import com.edutrack.dto.AdminDashboardResponse;
import com.edutrack.dto.StudentDashboardResponse;
import com.edutrack.dto.TeacherDashboardResponse;
import com.edutrack.entity.Teacher;
import com.edutrack.repository.*;
import com.edutrack.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired private StudentRepository studentRepository;
    @Autowired private CourseRepository courseRepository;
    @Autowired private EnrollmentRepository enrollmentRepository;
    @Autowired private AttendanceRepository attendanceRepository;
    @Autowired private TimetableRepository timetableRepository;
    @Autowired private AnnouncementRepository announcementRepository;
    @Autowired private MarkRepository markRepository;
    @Autowired private TeacherRepository teacherRepository; // ✅ Added

    @Override
    public AdminDashboardResponse getAdminDashboard() {
        AdminDashboardResponse res = new AdminDashboardResponse();
        res.setTotalStudents(studentRepository.count());
        res.setTotalCourses(courseRepository.count());
        res.setTotalEnrollments(enrollmentRepository.count());
        res.setAttendanceRecords(attendanceRepository.count());
        res.setAnnouncementsCount(announcementRepository.count());
        return res;
    }

    @Override
    public TeacherDashboardResponse getTeacherDashboard(Long teacherId) {
        TeacherDashboardResponse res = new TeacherDashboardResponse();

        // ✅ Fetch and set teacher name
        String teacherName = teacherRepository.findById(teacherId)
            .map(Teacher::getName)
            .orElse("Unknown");

        res.setTeacherName(teacherName);
        res.setClassesCount(timetableRepository.countByTeacherId(teacherId));
        res.setAnnouncementsCount(announcementRepository.count());

        return res;
    }

    @Override
    public StudentDashboardResponse getStudentDashboard(Long studentId) {
        int totalCourses = enrollmentRepository.countByStudentId(studentId);

        Double attendancePercentage = attendanceRepository.calculateAttendancePercentage(studentId);
        if (attendancePercentage == null) attendancePercentage = 0.0;

        Double averageMarks = markRepository.calculateAverageMarks(studentId);
        if (averageMarks == null) averageMarks = 0.0;

        int timetableCount = timetableRepository.countByStudentId(studentId);

        return new StudentDashboardResponse(
                totalCourses,
                attendancePercentage,
                averageMarks,
                timetableCount
        );
    }
}
