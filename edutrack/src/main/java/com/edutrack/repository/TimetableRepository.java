package com.edutrack.repository;

import com.edutrack.entity.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TimetableRepository extends JpaRepository<Timetable, Long> {

    // ✅ For TimetableServiceImpl
    List<Timetable> findByCourseId(Long courseId);

    List<Timetable> findByTeacherId(Long teacherId);

    List<Timetable> findByStudentId(Long studentId);

    // ✅ For dashboards
    @Query("SELECT COUNT(t) FROM Timetable t WHERE t.studentId = :studentId")
    int countByStudentId(Long studentId);

    @Query("SELECT COUNT(t) FROM Timetable t WHERE t.teacherId = :teacherId")
    int countByTeacherId(Long teacherId);
}
