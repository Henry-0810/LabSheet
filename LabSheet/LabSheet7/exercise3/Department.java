package LabSheet7.exercise3;

import java.util.Arrays;

public class Department {
    private String name;
    private Student[] student;

    public Department(String name, Student[] student){
        setName(name);
        setStudent(student);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Student[] getStudent() {
        return student;
    }

    @Override
    public String toString() {
        String str = "Name: ";
        return "Name: " + getName() + "\nList of Students:\n\n " + getStudent();
    }
}
