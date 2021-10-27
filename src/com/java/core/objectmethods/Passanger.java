package com.java.core.objectmethods;

import java.util.Objects;

public class Passanger {
    @Override
    public int hashCode() {
        return this.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    //    @Override
//    public String toString() {
//        return "Passanger{" +
//                "fname='" + fname + '\'' +
//                ", lname='" + lname + '\'' +
//                '}';
//    }

    private String fname;

    public Passanger(int id,String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        this.id=id;
    }

    private String lname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public boolean equals(Object o) {
        Passanger p=(Passanger)o;
               if(p.getId()==this.id && p.getFname().equals(this.fname) &&  p.getLname().equals(this.lname))
                   return true;
               else
                   return false;

    }
}
