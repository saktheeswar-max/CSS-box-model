package com.edutrack.repository;

import com.edutrack.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarkRepository extends JpaRepository<Mark, Long> {

    List<Mark> findByStudentId(Long studentId);

    @Query("SELECT AVG(m.marks) FROM Mark m WHERE m.studentId = :studentId")
    Double calculateAverageMarks(Long studentId);
}
