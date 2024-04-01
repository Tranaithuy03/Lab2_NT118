package com.example.bai3_lab2;

import androidx.annotation.NonNull;

public class Employee {
    private String id;
    private String name;
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public double tinhLuong(){
        return 0;
    }
    public String toString() {
        return this.id +" - "+this.name+" -->";
    }

}
