package com.example.arielpc.proyecto001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        ArrayList<User> arrayofUsers = new ArrayList<User>();

        User user1 = new User("Pedro", "Av.27 Febrero");
        User user2 = new User("Dilannia", "Av.29 Febrero");

        arrayofUsers.add(user1);
        arrayofUsers.add(user2);

        //create the adapter to convert the array to views
        UsersAdapter adapter = new UsersAdapter(this, arrayofUsers);

        //Attach the adapter to a ListView
        ListView listView = (ListView)findViewById(R.id.listViewCustom);
        listView.setAdapter(adapter);
    }
}
