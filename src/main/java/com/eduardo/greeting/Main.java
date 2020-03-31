package com.eduardo.greeting;

import java.util.Scanner;

/**
 * @author EduardoGiacomini <carloseduardo.diasgiacomini@gmail.com>
 *
 */
public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        Scanner keyboard = new Scanner(System.in);
        int hourOfDay;
        String greetingShouldIUse;

        // Do this until ctrl + c is pressed...
        while (true) {
            try {
                System.out.println("Oh my gosh. Can you say me what time hour is it? (integer)");
                hourOfDay = keyboard.nextInt();
                greetingShouldIUse = greeting.getGreeting(hourOfDay);
                System.out.println(greetingShouldIUse);
            } catch (Exception error) {
                System.out.println(error);
            }
        }
    }
}
