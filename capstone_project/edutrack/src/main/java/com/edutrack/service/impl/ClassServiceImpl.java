package com.edutrack.service.impl;

import com.edutrack.repository.ClassRepository;
import com.edutrack.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassRepository classRepository;

    @Override
    public long countByTeacherId(Long teacherId) {
        return classRepository.countByTeacherId(teacherId);
    }
}
