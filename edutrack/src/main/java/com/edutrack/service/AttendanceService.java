package com.edutrack.service;

import com.edutrack.entity.Attendance;

import java.util.List;

public interface AttendanceService {

    Attendance save(Attendance attendance);

    List<Attendance> findAll();

    List<Attendance> findByStudentId(Long studentId);

    void delete(Long id);
}
