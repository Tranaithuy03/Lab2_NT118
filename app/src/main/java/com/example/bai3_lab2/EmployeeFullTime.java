package com.example.bai3_lab2;

public class EmployeeFullTime extends Employee{
    public EmployeeFullTime(){
    }
    @Override
    public double tinhLuong()
    {
        return 500;
    }
    @Override
    public String toString() {
        return super.toString() + "FullTime="+this.tinhLuong();
    }
}
