package com.cc.java;

public class Mitarbeiter 
{

    private String lastNameString;
    private String firstNameString;
    private int birthYear;
    public String workID;
    public String departmentString;
    public String roleString;
    
    
    
    public Mitarbeiter(String lastNameString, String firstNameString, int birthYear, String workID,
            String departmentString, String roleString) {
        this.lastNameString = lastNameString;
        this.firstNameString = firstNameString;
        this.birthYear = birthYear;
        this.workID = workID;
        this.departmentString = departmentString;
        this.roleString = roleString;
    }
    
    //Nachnamen
    public String getLastNameString() 
    {
        return lastNameString;
    }
    public void setLastNameString(String lastNameString) 
    {
        this.lastNameString = lastNameString;
    }
    // Vornamen
    public String getFirstNameString() 
    {
        return firstNameString;
    }

    public void setFirstNameString(String firstNameString) {
        this.firstNameString = firstNameString;
    }
    // Geburtsname
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    // Eingloggt


   


    
}
