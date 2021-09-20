package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv_List;
    TextView tv_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv_List =  (ListView) findViewById(R.id.lv_list);
        final TextView hasil = (TextView) findViewById(R.id.tv_List);

        String [] fruits = new String [] {
                "Semangka",
                "Jeruk",
                "Mangga",
                "Melon",
                "Jambu"
        };

        List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits_list);

        lv_List.setAdapter(arrayAdapter);
        lv_List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                    String selectedItem =(String) parent.getItemAtPosition(position);

                    tv_list.setText("Your favorite :" + selectedItem);
            }
        });
    }
}