package com.brunoyam.unit_2_2.models;

public class Student extends Person {

    public Student(String name, String secondName, String surname) {
        super(name, secondName, surname);
    }

    @Override
    String getRegalia() {
        return "Student";
    }
}
