package com.liz.linkedapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        list1.findViewById(R.id.listOne);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ThirdActivity.this, "King at Position"+ position, Toast.LENGTH_SHORT).show();
               if (position==0){
                   Intent intent =new Intent(ThirdActivity.this,SecondActivity.class);
                   startActivity(intent);
               }
               else if(position == 1){
                   Intent intent=new Intent(ThirdActivity.this,SecondActivity.class);
                   startActivity(intent);
               }
               else{
                   Toast.makeText(ThirdActivity.this, "The rest is clicked", Toast.LENGTH_SHORT).show();
               }

            }
        });
    }
}
