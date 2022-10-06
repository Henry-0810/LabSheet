package LabSheet7.exercise3;

import javax.imageio.plugins.tiff.TIFFTag;

public class TestCollegeApp {
    static Department[] department = new Department[5];
    static Institute ITT = new Institute("Institute of Technology, Tralee", department);
    public static void main(String[] args) {
        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(453726, "Tommy", "Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student[] computing = new Student[10];
        computing[0] = student1;
        computing[1] = student3;

        Student[] creativeMedia = new Student[10];
        creativeMedia[0] = student2;
        creativeMedia[1] = student4;

        Department department1 = new Department("Computing", computing);
        Department department2 = new Department("Creative Media", creativeMedia);

        department[0] = department1;
        department[1] = department2;

        System.out.println(ITT);
        System.out.println("Total students in institute: " + ITT.getTotalStd());

        chgDept(154345,department1,department2);
        System.out.println(department1);
        System.out.println(department2);
    }
    public static void chgDept(int ID, Department dpt1, Department dpt2) {
        //check isNull
        boolean dept1 = false, dept2 = false;
        for (Department dept : ITT.getDepartment()) {
            if (dept != null) {
                if(dept == dpt1)  dept1 = true;
                if(dept == dpt2)  dept2 = true;
                }
        }

        if (dept1 && dept2) {
            for (int i = 0; i < dpt1.getStudent().length; i++) {
                Student[] std = dpt1.getStudent();
                if (std[i] != null) {
                    if (std[i].getId() == ID) {
                        System.out.println("Found " + std[i].getName() + "!\n");
                        std[i].setDepartment(dpt2.getName());

                        //drop jake
                        Student[] newDpt1 = new Student[std.length];
                        System.arraycopy(dpt1.getStudent(), 0, newDpt1, 0, i);
                        System.arraycopy(dpt1.getStudent(), i + 1, newDpt1, i, std.length - i - 1);
                        dpt1.setStudent(newDpt1);

                        //add variable
                        for (int j = 0; j < dpt2.getStudent().length; j++) {
                            if (dpt2.getStudent()[j] == null) {
                                dpt2.getStudent()[j] = std[i];
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Jake not found!");
                    }
                }
            }
        }
        else {
            System.out.println("Department not found!");
        }
    }
}
