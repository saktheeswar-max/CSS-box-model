package com.edutrack.service.impl;

import com.edutrack.entity.Mark;
import com.edutrack.repository.MarkRepository;
import com.edutrack.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkServiceImpl implements MarkService {

    @Autowired
    private MarkRepository repo;

    @Override
    public Mark save(Mark mark) {
        return repo.save(mark);
    }

    @Override
    public List<Mark> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Mark> findByStudentId(Long studentId) {
        return repo.findByStudentId(studentId);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
