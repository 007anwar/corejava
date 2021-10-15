package com.java.core.inheritance.employee;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Anwar", "Sales", 100000, new String[]{"CDP", "NetBank"});
        manager.displayDetails();
        manager.work();
    }
}
