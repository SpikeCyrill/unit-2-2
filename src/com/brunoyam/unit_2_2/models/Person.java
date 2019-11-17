package com.brunoyam.unit_2_2.models;

public abstract class Person {
    private String name;
    private String secondName;
    private String surname;

    public Person() {
    }

    public Person(String name, String secondName, String surname) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
    }

    abstract String getRegalia();

    @Override
    public String toString() {
        return getRegalia() + " " + surname + " " + name + " " + secondName;
    }

}
