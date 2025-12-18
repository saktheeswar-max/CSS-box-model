package com.edutrack.service;

import com.edutrack.entity.Timetable;
import java.util.List;

public interface TimetableService {

    Timetable save(Timetable timetable);

    List<Timetable> findAll();

    List<Timetable> findByCourseId(Long courseId);

    List<Timetable> findByTeacherId(Long teacherId);

    List<Timetable> findByStudentId(Long studentId);

    void delete(Long id);
}
