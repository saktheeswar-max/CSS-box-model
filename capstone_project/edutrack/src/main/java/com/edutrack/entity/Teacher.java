package com.edutrack.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String department;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Announcement> announcements;

    public Teacher() {}

    public Teacher(String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public List<Announcement> getAnnouncements() { return announcements; }
    public void setAnnouncements(List<Announcement> announcements) { this.announcements = announcements; }
}
