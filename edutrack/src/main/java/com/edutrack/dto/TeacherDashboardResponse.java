package com.edutrack.dto;

public class TeacherDashboardResponse {

    private String teacherName;
    private long classesCount;
    private long announcementsCount;

    public TeacherDashboardResponse() {}

    public TeacherDashboardResponse(String teacherName, long classesCount, long announcementsCount) {
        this.teacherName = teacherName;
        this.classesCount = classesCount;
        this.announcementsCount = announcementsCount;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public long getClassesCount() {
        return classesCount;
    }

    public void setClassesCount(long classesCount) {
        this.classesCount = classesCount;
    }

    public long getAnnouncementsCount() {
        return announcementsCount;
    }

    public void setAnnouncementsCount(long announcementsCount) {
        this.announcementsCount = announcementsCount;
    }
}
