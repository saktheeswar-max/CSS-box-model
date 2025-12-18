package com.edutrack.dto;

public class StudentDashboardResponse {

    private int totalCourses;
    private double attendancePercentage;
    private double averageMarks;
    private int timetableCount;

    public StudentDashboardResponse(int totalCourses, double attendancePercentage, double averageMarks, int timetableCount) {
        this.totalCourses = totalCourses;
        this.attendancePercentage = attendancePercentage;
        this.averageMarks = averageMarks;
        this.timetableCount = timetableCount;
    }

    public int getTotalCourses() {
        return totalCourses;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public int getTimetableCount() {
        return timetableCount;
    }
}
