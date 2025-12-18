package com.edutrack.repository;

import com.edutrack.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    List<Attendance> findByStudentId(Long studentId);

    @Query("SELECT COUNT(a) FROM Attendance a WHERE a.studentId = :studentId")
    int countByStudentId(Long studentId);

    @Query("SELECT COUNT(a) FROM Attendance a WHERE a.studentId = :studentId AND a.status = 'PRESENT'")
    int countPresent(Long studentId);

    @Query("""
           SELECT 
               (COUNT(a) * 1.0) /
               NULLIF((SELECT COUNT(a2) FROM Attendance a2 WHERE a2.studentId = :studentId), 0)
           FROM Attendance a 
           WHERE a.studentId = :studentId AND a.status = 'PRESENT'
           """)
    Double calculateAttendancePercentage(Long studentId);
}
