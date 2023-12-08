package com.rafsan.class239and240listviewandcustomadapters;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);

    }


    // ================== Adapter===========================

    private class MyAdapter extends BaseAdapter {

        LayoutInflater layoutInflater;

        @Override
        public int getCount() {
            return 8;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView =  layoutInflater.inflate(R.layout.item, parent, false);

            ImageView imageView = myView.findViewById(R.id.imageView);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(MainActivity.this, "Hello \n Item number is :: "+position, Toast.LENGTH_LONG).show();

                }
            });

            return myView;
        }
    }
}