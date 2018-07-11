package com.example.ram.demo_niharika;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class GstListActivity extends AppCompatActivity {

    EditText inputAmount;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    HashMap<String, String> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst_list);
        list = new ArrayList<>();
        itemList = new HashMap<>();
        listView = (ListView) findViewById(R.id.listView);
        Cursor c = null;
        NewDatabaseHelper myDb = new NewDatabaseHelper(getApplicationContext());
    }
}
