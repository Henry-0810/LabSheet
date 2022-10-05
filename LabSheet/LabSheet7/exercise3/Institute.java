package LabSheet7.exercise3;


public class Institute {
    private String name;
    private Department[] department;

    public Institute(String name, Department[] department){
        setName(name);
        setDepartment(department);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department[] department) {
        this.department = department;
    }

    public Department[] getDepartment() {
        return department;
    }

    @Override
    public String toString() {

        StringBuilder dept = new StringBuilder();
        for (Department dpt: getDepartment()) {
            if (dpt != null) {
                dept.append(dpt).append("\n");
            }
        }

        return "Name: " + getName() + "\nDepartments: " + dept;
    }

    public int getTotalStd(){
        int totStd = 0;
        for (Department dpt: getDepartment()) {
            if (dpt != null) {
                for (Student std: dpt.getStudent()) {
                    if (std != null) {
                        totStd++;
                    }
                }
            }
        }
        return totStd;
    }

}

