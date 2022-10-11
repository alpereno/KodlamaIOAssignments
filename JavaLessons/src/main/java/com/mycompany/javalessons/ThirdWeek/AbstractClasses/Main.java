package com.mycompany.javalessons.ThirdWeek.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        GameCalculator[] gameCalculators = new GameCalculator[]{new WomanGameCalculator(), new ManGameCalculator(),
        new KidsGameCalculator()};
        
        for (GameCalculator gc:gameCalculators) {
            gc.calculate();
            gc.gameOver();
        }
    }
}
