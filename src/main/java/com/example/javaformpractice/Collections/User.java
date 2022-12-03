package com.example.javaformpractice.Collections;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int height;

    public User(String firstName, String lastName, int age, int height){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

}
