package LabSheet7.exercise3;

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

        StringBuilder listOfStd = new StringBuilder();

        for (Student students : getStudent()) {
            if (students != null)
                listOfStd.append(students).append("\n");
        }

        return "\nName: " + getName() + "\nList of Students: \n\n" + listOfStd;
    }
}
