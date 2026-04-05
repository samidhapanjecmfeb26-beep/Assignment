/* 8. Hospital Patient Record System 
Create a simple patient management program. 
Requirements 
● Create a class Patient with: 
○ patient ID 
○ patient name 
○ age 
○ disease 
● Create objects for at least 3 patients. 
● Display patient details. 
● Add a method to check whether the patient is a senior citizen (age 60 or above) */

import java.util.*;
class Patient
{
    int id;
    String name;
    int age;
    String disease;

    Patient(int id, String name, int age, String disease)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    boolean isSeniorCitizen()
    {
        return age >= 60;
    }

    void display()
    {
        System.out.println("Patient ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);

        if(isSeniorCitizen())
            System.out.println("Category     : Senior Citizen");
        else
            System.out.println("Category     : Not Senior Citizen");

        System.out.println("-----------------------------");
    }
}

// Main class
class HospitalPatientRecordSystem 
{
    public static void main(String args[])
    {
        // Creating 3 patient objects
        Patient p1 = new Patient(101, "Rahul", 65, "Diabetes");
        Patient p2 = new Patient(102, "Anita", 45, "Fever");
        Patient p3 = new Patient(103, "Suresh", 70, "Hypertension");

        // Display details
        System.out.println("===== PATIENT RECORDS =====\n");

        p1.display();
        p2.display();
        p3.display();
    }
}