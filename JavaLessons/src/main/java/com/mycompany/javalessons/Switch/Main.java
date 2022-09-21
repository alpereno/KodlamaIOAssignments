package com.mycompany.javalessons.Switch;

public class Main {
    public static void main(String[] args) {
        char grade = 'F';
        switch (grade) {
            case 'A':
                System.out.println("GJ WP Pass with A");
                break;
            case 'B':
                System.out.println("GJ Pass with B");
                break;
            case 'C':
                System.out.println("Pass with C");
                break;
            case 'D':
                System.out.println("May pass with D");
                break;
            case 'F':
                System.out.println("Fail with F");
                break;
            default:
                System.out.println("Wrong");
                break;
        }
    }
}
