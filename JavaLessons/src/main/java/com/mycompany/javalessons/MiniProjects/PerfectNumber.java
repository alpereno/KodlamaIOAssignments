package com.mycompany.javalessons.MiniProjects;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 29;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " isn't a perfect number.");
        }
    }
}
