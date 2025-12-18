package com.edutrack.repository;

import com.edutrack.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    List<Enrollment> findByStudentId(Long studentId);

    List<Enrollment> findByCourseId(Long courseId);

    @Query("SELECT COUNT(e) FROM Enrollment e WHERE e.courseId = :courseId")
    int countByCourseId(Long courseId);

    @Query("SELECT COUNT(e) FROM Enrollment e WHERE e.studentId = :studentId")
    int countByStudentId(Long studentId);
}
