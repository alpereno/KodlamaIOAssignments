package com.mycompany.javalessons.FirstWeek.MiniProjects;

public class Vowels {
    public static void main(String[] args) {
        char letter = 'A';
        switch (letter) {
            case 'A':
            case 'O':
                System.out.println("It is a bold vowel.");
                break;
            case 'E':
            case 'I':
            case 'U':
                System.out.println("It is a thin vowel.");
                break;
            default:
                System.out.println("It isn't a vowel.");
                break;
        }
    }    
}
