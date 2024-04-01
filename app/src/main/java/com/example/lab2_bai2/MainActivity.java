package com.example.lab2_bai2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

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
        setContentView(R.layout.activity_main);
        ListView lvPerson = (ListView) findViewById(R.id.lv_person);
        TextView tvResult = (TextView)findViewById(R.id.tv_result);
        EditText ed_Name = (EditText) findViewById(R.id.txt_input);
        Button btnSubmit=(Button) findViewById(R.id.btn_submit);
        ArrayList<String> names = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        lvPerson.setAdapter(adapter);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                names.add(ed_Name.getText().toString());
                adapter.notifyDataSetChanged();
                ed_Name.setText("");
            }
        });
        lvPerson.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                tvResult.setText("position :" + arg2 + "; value =" + names.get(arg2));
            }
        });
        lvPerson.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                names.remove(position);
                adapter.notifyDataSetChanged();
                tvResult.setText("");
                return false;
            }
        });
    }
}