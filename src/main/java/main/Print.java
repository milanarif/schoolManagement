package main;

import entity.Student;

public class Print {

    public static void printStudentHead(){
        System.out.println("\nID               Name                Credits   Gender    Department");
        System.out.println("--------------   -----------------   -------   -------   -----------");
    }

    public static void printStudent(Student s){
        System.out.printf("%-17s", s.getSocialSecurity());
        System.out.printf("%-20s", s.getName());
        System.out.printf("%-10.2f", s.getCredits());
        System.out.printf("%-10s", s.getGender());
        System.out.printf("%-10s", s.getDepartment());
    }
}
