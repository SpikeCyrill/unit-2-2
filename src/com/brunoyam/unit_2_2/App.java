package com.brunoyam.unit_2_2;

import com.brunoyam.unit_2_2.models.Person;
import com.brunoyam.unit_2_2.models.Ranks;
import com.brunoyam.unit_2_2.models.Soldier;
import com.brunoyam.unit_2_2.models.Student;

public class App {

    public static void main(String[] args) {

        Soldier bruce = new Soldier("Bruce", "Petrovich", "Willis", Ranks.GENERAL);

        Student artemka = new Student("Artem", "Michailovich", "Obuhov");

        printPersonSignature(bruce);
        printPersonSignature(artemka);

    }

    public static void printPersonSignature(Person person) {
        System.out.println(person.toString());
    }


}
