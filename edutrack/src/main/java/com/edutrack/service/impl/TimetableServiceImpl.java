package com.edutrack.service.impl;

import com.edutrack.entity.Timetable;
import com.edutrack.repository.TimetableRepository;
import com.edutrack.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimetableServiceImpl implements TimetableService {

    @Autowired
    private TimetableRepository repo;

    @Override
    public Timetable save(Timetable timetable) {
        return repo.save(timetable);
    }

    @Override
    public List<Timetable> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Timetable> findByCourseId(Long courseId) {
        return repo.findByCourseId(courseId);
    }

    @Override
    public List<Timetable> findByTeacherId(Long teacherId) {
        return repo.findByTeacherId(teacherId);
    }

    @Override
    public List<Timetable> findByStudentId(Long studentId) {
        return repo.findByStudentId(studentId);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
