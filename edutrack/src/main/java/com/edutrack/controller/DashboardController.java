package com.edutrack.controller;

import com.edutrack.dto.AdminDashboardResponse;
import com.edutrack.dto.StudentDashboardResponse;
import com.edutrack.dto.TeacherDashboardResponse;
import com.edutrack.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/admin")
    public AdminDashboardResponse getAdminDashboard() {
        return dashboardService.getAdminDashboard();
    }

    @GetMapping("/teacher/{teacherId}")
    public TeacherDashboardResponse getTeacherDashboard(@PathVariable Long teacherId) {
        return dashboardService.getTeacherDashboard(teacherId);
    }

    @GetMapping("/student/{studentId}")
    public StudentDashboardResponse getStudentDashboard(@PathVariable Long studentId) {
        return dashboardService.getStudentDashboard(studentId);
    }
}
