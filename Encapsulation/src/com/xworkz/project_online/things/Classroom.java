package com.xworkz.project_online.things;

public class Classroom {
    
    private String className;
    private int totalStudents;
    private String teacherName;
    private int roomNumber;
    private boolean isSmartClass;

    public Classroom(String className, int totalStudents, String teacherName, int roomNumber, boolean isSmartClass) {
        this.className = className;
        this.totalStudents = totalStudents;
        this.teacherName = teacherName;
        this.roomNumber = roomNumber;
        this.isSmartClass = isSmartClass;
    }

    @Override
    public String toString() {
        return "Classroom Details: \n" +
               "Class Name: " + className + "\n" +
               "Total Students: " + totalStudents + "\n" +
               "Teacher Name: " + teacherName + "\n" +
               "Room Number: " + roomNumber + "\n" +
               "Smart Class: " + (isSmartClass ? "Yes" : "No");
    }
}

