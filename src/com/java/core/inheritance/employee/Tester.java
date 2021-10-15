package com.java.core.inheritance.employee;

public class Tester extends Employee {
    String[] tools;

    public Tester(int id, String name, String dept, double salary, String[] tools) {
        super(id, name, dept, salary);
        this.tools = tools;
    }

    @Override
    protected void work() {
        super.work();
        System.out.println("Tester is working on");
        for(String tool:tools)
            System.out.println(tool);
    }
}
