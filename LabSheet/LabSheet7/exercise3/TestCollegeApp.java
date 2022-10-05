package LabSheet7.exercise3;

public class TestCollegeApp {
    public static Department[] department = new Department[5];
    public static Institute ITT = new Institute("Institute of Technology, Tralee", department);
    public static void main(String[] args) {
        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(453726, "Tommy", "Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student computing[] = new Student[10];
        computing[0] = student1;
        computing[1] = student3;

        Student creativeMedia[] = new Student[10];
        creativeMedia[0] = student2;
        creativeMedia[1] = student4;

        Department department1 = new Department("Computing", computing);
        Department department2 = new Department("Creative Media", creativeMedia);

        department[0] = department1;
        department[1] = department2;

        System.out.println(ITT);
        System.out.println("Total students in institute: " + ITT.getTotalStd());

        chgDept(154345,department1,department2);
    }
    public static void chgDept(int ID, Department dpt1, Department dpt2){
        //check if both dept are in dept array
        //dpt1 = comp; dpt2 = cMedia
        boolean validDptArr = false;
        for (Department dept : department) {
            if (dept != null) {
                if (dept.getName().equals("Computing")) {
                    dpt1 = department[0];
                if (dept.getName().equals("Creative Media")) {
                    dpt2 = department[1];
                }
                for (Student std: dpt1.getStudent()) {
                    if (std != null) {
                        if(std.getId() == ID){
                            System.out.println("Dpt 1 Found Jake!");
                        }
                        else{
                            System.out.println("Dpt 1 Couldn't find Jake");
                        }
                        break;
                    }
                }
                for (Student std: dpt2.getStudent()) {
                    if (std != null) {
                        if(std.getId() == ID){
                            System.out.println("Dpt 2 Found Jake!");
                        }
                        else{
                            System.out.println("Dpt 2 Couldn't find Jake");
                        }
                        break;
                    }
                }
            }
            }
        }
    }

}

