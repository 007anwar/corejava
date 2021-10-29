package com.java.core.collection.comparator;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
        public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o1.name.compareTo(o2.name\);
//    }
}
