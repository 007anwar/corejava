package com.java.core.stringhandling.immutable;

import java.util.Objects;

public class User {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        User u= (User) o;
        if(this.getId().equals(u.getId())&&this.getName().equals(u.getName()))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
