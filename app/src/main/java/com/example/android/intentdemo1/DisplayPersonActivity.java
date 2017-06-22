package com.example.android.intentdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayPersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_person);

        Intent intent = getIntent();
        Person person = (Person)intent.getSerializableExtra(MainActivity.EXTRA_PERSON);

        TextView tvName = (TextView) findViewById(R.id.tv_name);
        TextView tvEmail = (TextView) findViewById(R.id.tv_email);
        TextView tvAge = (TextView) findViewById(R.id.tv_age);

        tvName.setText(person.getName());
        tvEmail.setText(person.getEmail());
        tvAge.setText(Integer.toString(person.getAge()));
    }
}
