package com.edutrack.service;

import com.edutrack.dto.AdminDashboardResponse;
import com.edutrack.dto.StudentDashboardResponse;
import com.edutrack.dto.TeacherDashboardResponse;

public interface DashboardService {
    AdminDashboardResponse getAdminDashboard();
    TeacherDashboardResponse getTeacherDashboard(Long teacherId);
    StudentDashboardResponse getStudentDashboard(Long studentId);
}
