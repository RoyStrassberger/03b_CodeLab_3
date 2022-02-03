package com.cc.java;

public class App {

    public static void main(String[] args) {
        Mittarbeiter mittarbeiter = new.getMitarbeiterAtributes("Hofer","Karl",1971,007,"IT-Service","Aushilfe");
        output("Nachname: " + Mittarbeiter.lastNameString());
        output("Vorname: " + Mittarbeiter.firstNameString());
        output("Geboren: " + Mittarbeiter.birthYear());
        output("Arbeiter-Nr.: "+ Mittarbeiter.workID());
        output("Abteilung: "+ Mittarbeiter.departmentString());
        output("Arbeitsrolle: "+ Mittarbeiter.roleString());

      
    }
  

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
