package com.edutrack.controller;

import com.edutrack.entity.Timetable;
import com.edutrack.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timetable")
@CrossOrigin(origins = "*")
public class TimetableController {

    @Autowired
    private TimetableService timetableService;

    @PostMapping
    public Timetable addTimetable(@RequestBody Timetable timetable) {
        return timetableService.save(timetable);
    }

    @GetMapping
    public List<Timetable> getAllTimetable() {
        return timetableService.findAll();
    }

    @GetMapping("/course/{courseId}")
    public List<Timetable> getByCourse(@PathVariable Long courseId) {
        return timetableService.findByCourseId(courseId);
    }

    @GetMapping("/teacher/{teacherId}")
    public List<Timetable> getByTeacher(@PathVariable Long teacherId) {
        return timetableService.findByTeacherId(teacherId);
    }

    @GetMapping("/student/{studentId}")
    public List<Timetable> getByStudent(@PathVariable Long studentId) {
        return timetableService.findByStudentId(studentId);
    }

    @DeleteMapping("/{id}")
    public void deleteTimetable(@PathVariable Long id) {
        timetableService.delete(id);
    }
}
