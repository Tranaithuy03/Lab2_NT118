package com.example.bai4_lab2;

public class Employee {
    private String id;
    private String fullName;
    private boolean isManager;
    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isManager() {
        return isManager;
    }
}
