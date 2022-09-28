package com.mycompany.javalessons.FirstWeek.MiniProjects;

public class PrimeNumber {
    public static void main(String[] args) {
        int value=3;
        System.out.println(isPrime(value));
    }
    
        public static boolean isPrime(int value){
        if (value < 2) 
            return false;
        for (int i = 2; i*i <= value ; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }
}
