package com.mycompany.javalessons.SecondWeek;

public class ValueAndRefType {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 6;
        
        num2 = num1;
        num1 = 10;
        System.out.println("num 2 = " + num2);
        System.out.println("num 1 = " + num1);
        
        int[] numbers1 = new int[]{1,3,5};
        int[] numbers2 = new int[]{2,4,6};
        
        numbers2 = numbers1;
        numbers1[0]=11;
        System.out.println("numbers2[0] = " + numbers2[0]);
        System.out.println("numbers1[0] = " + numbers1[0]);
        
        System.out.println(numbers2);   // ref 
        System.out.println(numbers1);   // ref
    }
}
