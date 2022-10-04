package LabSheet7.exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {
        Student student1 = new Student(154345,"Jake","Computing");
        Student student2 = new Student(234532,"Mary","Creative Media");
        Student student3 = new Student(453726,"Tommy","Computing");
        Student student4 = new Student(623456,"Peter","Creative Media");

        Student computing[] = new Student[10];
        computing[0] = student1;
        computing[1] = student3;

        Student creativeMedia[] = new Student[10];
        creativeMedia[0] = student2;
        creativeMedia[1] = student4;

        Department department1 = new Department("Computing",computing);
        Department department2 = new Department("Creative Media",creativeMedia);

        Department department[] = new Department[5];
        department[0] = department1;
        department[1] = department2;

        Institute institute = new Institute("Institute of Technology, Tralee", department);

        System.out.println(institute);
    }
}
