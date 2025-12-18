package com.edutrack.service.impl;

import com.edutrack.entity.Attendance;
import com.edutrack.repository.AttendanceRepository;
import com.edutrack.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository repo;

    @Override
    public Attendance save(Attendance attendance) {
        return repo.save(attendance);
    }

    @Override
    public List<Attendance> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Attendance> findByStudentId(Long studentId) {
        return repo.findByStudentId(studentId);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
