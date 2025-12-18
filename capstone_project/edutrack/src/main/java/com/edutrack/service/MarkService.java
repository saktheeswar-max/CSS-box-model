package com.edutrack.service;

import com.edutrack.entity.Mark;

import java.util.List;

public interface MarkService {

    Mark save(Mark mark);

    List<Mark> findAll();

    List<Mark> findByStudentId(Long studentId);

    void delete(Long id);
}
