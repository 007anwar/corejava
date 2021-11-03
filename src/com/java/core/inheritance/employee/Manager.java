package com.java.core.inheritance.employee;

public class Manager extends Employee {
String[] projects;
    public Manager(int id, String name, String dept, double salary, String[] projects) {
        super(id, name, dept, salary);
        this.projects = projects;
    }

    @Override
    @Deprecated
    protected void work() {
        super.work();
        System.out.println("Managers projects: ");
        for(String project:projects)
            System.out.println(project);
    }

}
