package com.example.android.intentdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etEmail, etAge;
    private String name, email;
    private int age;
    public static final String EXTRA_PERSON="com.example.intentdemo1.PERSON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendData(View view){

        etName = (EditText) findViewById(R.id.name);
        etEmail = (EditText) findViewById(R.id.email);
        etAge= (EditText) findViewById(R.id.age);

        name = etName.getText().toString();
        email = etEmail.getText().toString();
        age = Integer.parseInt(etAge.getText().toString());

        Person person = new Person(name, email, age);

        Intent intent = new Intent(MainActivity.this, DisplayPersonActivity.class);
        intent.putExtra(EXTRA_PERSON, person);
        startActivity(intent);

    }
}
