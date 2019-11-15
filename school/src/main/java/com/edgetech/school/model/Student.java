package com.edgetech.school.model;
import java.util.List;

public class Student {
    private int id;
    private String studentName;
    private String studentDescription;
    private List<Course> courses;

    public Student(int id, String studentName, String studentDescription, List<Course> courses) {
        this.id = id;
        this.studentName = studentName;
        this.studentDescription = studentDescription;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDescription() {
        return studentDescription;
    }

    public void setStudentDescription(String studentDescription) {
        this.studentDescription = studentDescription;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id:" + id +
                ", studentName:\"" + studentName + "\"" +
                ", studentDescription:\"" + studentDescription + "\"" +
                ", courses:" + courses + "\"" +
                "}";
    }
}
