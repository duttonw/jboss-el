package org.jboss.el.beans;

import java.util.ArrayList;
import java.util.List;

public final class Company {

    private List<Department> departments;
    private String name;
    private Employee president;
    
    public Company() {
        super();
        this.departments = new ArrayList<Department>();
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getPresident() {
        return president;
    }

    public void setPresident(Employee president) {
        this.president = president;
    }

}
