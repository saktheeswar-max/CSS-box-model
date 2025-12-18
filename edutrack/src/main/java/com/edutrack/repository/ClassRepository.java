package com.edutrack.repository;

import com.edutrack.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class, Long> {
    long countByTeacherId(Long teacherId);
}
