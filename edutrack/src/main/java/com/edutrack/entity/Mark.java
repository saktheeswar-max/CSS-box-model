package com.edutrack.entity;

import jakarta.persistence.*;

@Entity
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private Long courseId;

    private Integer marks;
    private String examType;   // Midterm / Final etc.

    public Mark() {}

    public Mark(Long studentId, Long courseId, Integer marks, String examType) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.marks = marks;
        this.examType = examType;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }

    public Integer getMarks() { return marks; }
    public void setMarks(Integer marks) { this.marks = marks; }

    public String getExamType() { return examType; }
    public void setExamType(String examType) { this.examType = examType; }
}
