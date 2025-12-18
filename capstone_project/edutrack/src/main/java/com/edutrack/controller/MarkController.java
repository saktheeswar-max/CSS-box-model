package com.edutrack.controller;

import com.edutrack.entity.Mark;
import com.edutrack.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marks")
@CrossOrigin(origins = "*")
public class MarkController {

    @Autowired
    private MarkService markService;

    @PostMapping
    public Mark addMark(@RequestBody Mark mark) {
        return markService.save(mark);
    }

    @GetMapping
    public List<Mark> getAllMarks() {
        return markService.findAll();
    }

    @GetMapping("/student/{studentId}")
    public List<Mark> getMarksByStudent(@PathVariable Long studentId) {
        return markService.findByStudentId(studentId);
    }

    @DeleteMapping("/{id}")
    public void deleteMark(@PathVariable Long id) {
        markService.delete(id);
    }
}
