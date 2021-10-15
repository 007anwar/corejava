package com.java.core.inheritance.employee;

public class Employee {
    int id;
    String name;
    String dept;
    double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    protected void work()
    {
        System.out.println("Common work");
    }
    protected void displayDetails()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("dept:"+dept);
        System.out.println("Salary:"+salary);
    }

}
