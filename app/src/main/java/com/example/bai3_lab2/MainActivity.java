package com.example.bai3_lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Employee employee;
    RadioGroup rgType;
    EditText etId;
    EditText etName;
    ListView lv_Result;
    Button btn_Nhap;
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayAdapter<Employee> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etId = findViewById(R.id.edit_ID);
        etName = findViewById(R.id.edit_name);
        lv_Result = findViewById(R.id.lv_result);
        btn_Nhap = findViewById(R.id.button_Nhap);
        rgType = findViewById(R.id.rdGroup);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, employees);
        lv_Result.setAdapter(adapter);
        btn_Nhap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                addNewEmployee();
                rgType.clearCheck();
                etId.setText(null);
                etName.setText(null);
                etName.clearFocus();
            }
        });
    }
    public void addNewEmployee() {
        //Lấy ra đúng id của Radio Button được checked
        int radId = rgType.getCheckedRadioButtonId();
        String id = etId.getText().toString();
        String name = etName.getText().toString();
        if (radId == R.id.rad_ChinhThuc) {
            //tạo instance là FullTime
            employee = new EmployeeFullTime();
        } else {
            //Tạo instance là Partime
            employee = new EmployeePartTime();
        }
        //FullTime hay Partime thì cũng là Employee nên có các hàm này là hiển nhiên
        employee.setId(id);
        employee.setName(name);
        employees.add(employee);
        adapter.notifyDataSetChanged();
    }
}