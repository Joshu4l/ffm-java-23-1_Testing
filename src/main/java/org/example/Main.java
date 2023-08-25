package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Point");
        System.out.println("--------------");
    }


    //Eine Methode, die die Summe von zwei ganzen Zahlen berechnet
    public static int sum(int number1, int number2) {

        return number1 + number2;
    }


    //Eine Methode, die prüft, ob eine gegebene Zahl gerade ist (even)
    public static boolean isEven(int inputNumber) {

        return inputNumber % 2 == 0;
    }


    //Eine Methode, die das Produkt zweier ganzer Zahlen berechnet
    public static int multiply(int number1, int number2){

        return number1 * number2;
    }


    //Eine Methode, die eine gegebene Zeichenkette in Großbuchstaben umwandelt
    public static String turnIntoCapitalLetters(String inputString) {

        return inputString.toUpperCase();
    }


    //Eine Methode, die prüft, ob eine gegebene Zahl positiv ist.
    public static boolean isPositive(int inputNumber) {

        return inputNumber >= 0;
    }
}