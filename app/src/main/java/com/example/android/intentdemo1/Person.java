package com.example.android.intentdemo1;

/**
 * Created by WanChing on 22/6/2017.
 */

public class Person implements java.io.Serializable {

    private String name, email;
    private  int age;

    public Person (String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person(){
        this("", "", 0);
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    public void setName(){
        this.name=name;
    }

    public void setEmail(){
        this.email = email;
    }

    public void setAge(){
        this.age= age;
    }

}
