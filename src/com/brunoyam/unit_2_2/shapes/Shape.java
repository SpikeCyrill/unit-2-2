package com.brunoyam.unit_2_2.shapes;

public interface Shape {
    
    double getArea();

    default double getPerimetr() {
        return 0;
    }

    static String getName() {
        return "Shape";
    }

}
