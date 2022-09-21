package com.mycompany.javalessons.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "Anna";
        String s2 = "Jane";
        String s3 = "Mark";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = "Mary";
        System.out.println(s4);

        System.out.println("-----------------------------");

        String[] students = new String[4];
        students[0] = "Anna";
        students[1] = "Jane";
        students[2] = "Mark";
        students[3] = "Mary";

        int len = students.length;
        for (int i = 0; i < len; i++) {
            System.out.println(students[i]);
        }

        System.out.println("-----------------------------");

        for (String student : students) {
            System.out.println(student);
        }
        
        // Multi Dim
        
        String[][] cities = new String[3][3];

        cities[0][0] = "London";
        cities[0][1] = "Birmingham";
        cities[0][2] = "Derby";
        cities[1][0] = "Glosgow";
        cities[1][1] = "Leeds";
        cities[1][2] = "Leicester";
        cities[2][0] = "Liverpool";
        cities[2][1] = "Macnhester";
        cities[2][2] = "Norwich";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(cities[i][j]);
            }
            System.out.println("------------------");
        }
    }
}
