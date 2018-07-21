package pl.coderslab;

import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {

        static int randomNumber(int range) {
            Random random = new Random();
            return (random.nextInt(range) + 1);
        }

        static int getNumber(String message, String errorMassage) {
            Scanner scann = new Scanner(System.in);
            System.out.println(message);
            while (!scann.hasNextInt()) {
                System.out.println(errorMassage);
                System.out.println(message);
                scann.next();
            }
            return (scann.nextInt());
        }

        public static void main(String[] args) {
            int userNumber= 0;
            int computerNumber = randomNumber(100);
            do {
                userNumber = getNumber("Podaj liczbę od 1 do 100", "It's not a number");
                if (userNumber > computerNumber) {
                    System.out.println("Too big number!");
                } else if (userNumber < computerNumber) {
                    System.out.println("Too small number!");
                }
            } while (userNumber!=computerNumber);
            System.out.println("You won!");
        }
    }
