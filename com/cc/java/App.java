package com.cc.java;

public class App {

    public static void main(String[] args) {
        Mitarbeiter mittarbeiter = new Mitarbeiter("Hofer","Karl",1971,007,"IT-Service","Aushilfe");
        output("Nachname: " + Mitarbeiter.lastNameString());
        output("Vorname: " + Mitarbeiter.firstNameString());
        output("Geboren: " + Mitarbeiter.birthYear());
        output("Arbeiter-Nr.: "+ Mitarbeiter.workID());
        output("Abteilung: "+ Mitarbeiter.departmentString());
        output("Arbeitsrolle: "+ Mitarbeiter.roleString());

      
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
