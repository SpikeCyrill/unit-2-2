package com.brunoyam.unit_2_2.models;

public class Soldier extends Person {

    Ranks rank;

    public Soldier(String name, String secondName, String surname, Ranks rank) {
        super(name, secondName, surname);
        this.rank = rank;
    }


    @Override
    String getRegalia() {
        return rank.getName();
    }

}
