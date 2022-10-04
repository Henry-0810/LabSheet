package LabSheet7.exercise3;

import java.util.Arrays;

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
        return "Name: " + getName() + "\nDepartments: " + Arrays.toString(getDepartment());
    }


}

