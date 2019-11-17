package com.brunoyam.unit_2_2.models;

public enum Ranks {

    CAPTAIN("Captain"),
    MAJOR("Major"),
    GENERAL("General");

    private String name;

    Ranks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
