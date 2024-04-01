package com.example.bai3_lab2;

public class EmployeePartTime extends Employee{
    public EmployeePartTime(){}
    public double tinhLuong()
    {
        return 150;
    }
    @Override
    public String toString() {
        return super.toString() + "PartTime="+this.tinhLuong();
    }
}
