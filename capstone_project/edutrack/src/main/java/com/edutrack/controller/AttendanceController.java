package com.edutrack.controller;

import com.edutrack.entity.Attendance;
import com.edutrack.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
@CrossOrigin(origins = "*")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping
    public Attendance addAttendance(@RequestBody Attendance attendance) {
        return attendanceService.save(attendance);
    }

    @PutMapping("/{id}")
    public Attendance updateAttendance(@PathVariable Long id, @RequestBody Attendance attendance) {
        attendance.setId(id);
        return attendanceService.save(attendance);
    }

    @GetMapping
    public List<Attendance> getAllAttendance() {
        return attendanceService.findAll();
    }

    @GetMapping("/student/{studentId}")
    public List<Attendance> getAttendanceByStudent(@PathVariable Long studentId) {
        return attendanceService.findByStudentId(studentId);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendance(@PathVariable Long id) {
        attendanceService.delete(id);
    }
}
