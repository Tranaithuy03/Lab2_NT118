package com.example.bai4_lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.lvResult);
        Button btnAdd = (Button) findViewById(R.id.btn_Add);
        EditText etId = (EditText) findViewById(R.id.edit_ID);
        EditText etName = (EditText) findViewById(R.id.edit_name);
        CheckBox checkBox = (CheckBox) findViewById(R.id.cb_Manager);
        EmployeeAdapter adapter = new EmployeeAdapter(this,android.R.layout.simple_list_item_1, new ArrayList<Employee>());
        listView.setAdapter(adapter);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Employee employee = new Employee();
                employee.setId(etId.getText().toString());
                employee.setFullName(etName.getText().toString());
                if(checkBox.isChecked())
                {
                    employee.setManager(true);
                }
                else employee.setManager(false);
                adapter.add(employee);
                adapter.notifyDataSetChanged();
                etId.setText(null);
                etName.setText(null);
                etName.clearFocus();
                checkBox.setChecked(false);
            }
        });
    }
}