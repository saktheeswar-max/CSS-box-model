package com.edutrack.entity;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;       // course name
    private String code;       // course code
    private String department;

    public Course() {}

    public Course(String name, String code, String department) {
        this.name = name;
        this.code = code;
        this.department = department;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
