package com.edgetech.school.model;
import java.util.List;

public class Course {
    private int id;
    private String courseName;
    private String courseDescription;
    private List<String> steps;

    public Course() {

    }

    public Course(int id, String courseName, String courseDescription, List<String> steps) {
        super();
        this.id = id;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.steps = steps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public List<String> getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id:" + id +
                ", courseName:\"" + courseName + "\"" +
                ", courseDescription:\"" + courseDescription + "\"" +
                ", steps:" + steps + "\"" +
                "}";
    }
}
