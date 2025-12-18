package com.edutrack.dto;

public class AdminDashboardResponse {

    private long totalStudents;
    private long totalCourses;
    private long totalEnrollments;
    private long attendanceRecords;
    private long announcementsCount;

    public long getTotalStudents() { return totalStudents; }
    public void setTotalStudents(long totalStudents) { this.totalStudents = totalStudents; }

    public long getTotalCourses() { return totalCourses; }
    public void setTotalCourses(long totalCourses) { this.totalCourses = totalCourses; }

    public long getTotalEnrollments() { return totalEnrollments; }
    public void setTotalEnrollments(long totalEnrollments) { this.totalEnrollments = totalEnrollments; }

    public long getAttendanceRecords() { return attendanceRecords; }
    public void setAttendanceRecords(long attendanceRecords) { this.attendanceRecords = attendanceRecords; }

    public long getAnnouncementsCount() { return announcementsCount; }
    public void setAnnouncementsCount(long announcementsCount) { this.announcementsCount = announcementsCount; }
}
