//Necessary Imports
package org.example;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class MainTest {

    //Schreibe einen Test für eine Methode, die die Summe von zwei ganzen Zahlen berechnet.
    @Test
    public void calculate_sum_given_two_integers() {
        //GIVEN
        int number1 = 3;
        int number2 = 5;

        //WHEN
        int actual = Main.sum(number1, number2);
        int expected = 8;

        //THEN
        Assertions.assertEquals(expected, actual);
    }


    //Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl gerade ist (even).
    @Test
    public void state_true_given_even_number() {
        //GIVEN
        int number = 2;

        //WHEN
        boolean actual = Main.isEven(number);
        boolean expected = true;

        //THEN
        Assertions.assertEquals(expected,actual);
    }

    //Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl gerade ist (even).
    @Test
    public void state_false_given_uneven_number() {
        //GIVEN
        int number = 3;

        //WHEN
        boolean actual = Main.isEven(number);
        boolean expected = false;

        //THEN
        Assertions.assertEquals(expected,actual);
    }


    //Schreibe einen Test für eine Methode, die das Produkt zweier ganzer Zahlen berechnet.
    @Test
    public void calculate_product_given_two_integers() {
        //GIVEN
        int number1 = 3;
        int number2 = 5;

        //WHEN
        int actual = Main.multiply(number1, number2);
        int expected = 15;

        //THEN
        Assertions.assertEquals(expected,actual);
    }


    //Schreibe einen Test für eine Methode, die eine gegebene Zeichenkette in Großbuchstaben umwandelt.
    @Test
    public void state_capitalized_string_given_any_string() {
        //GIVEN
        String inputString = "abcdefg";

        //WHEN
        String actual = Main.turnIntoCapitalLetters(inputString);
        String expected = "ABCDEFG";

        //THEN
        Assertions.assertEquals(expected, actual);
    }


    //Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl positiv ist.
    @Test
    public void state_true_given_positive_number() {
        //GIVEN
        int number = 18;

        //WHEN
        boolean actual = Main.isPositive(number);
        boolean expected = true;

        //THEN
        Assertions.assertEquals(expected, actual);
    }
}