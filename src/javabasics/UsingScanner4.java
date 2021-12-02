package javabasics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UsingScanner4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Do you like travelling?");
        String answer = scanner.nextLine();

        System.out.println("Where are you from?");
        String country = scanner.nextLine();

        System.out.println("How tall are you?");
        int length = scanner.nextInt();

        System.out.println("Summary: ");
        System.out.println("My name is " + name);
        System.out.println("I am  " + age + " years old");
        System.out.println("I am originally from " + country);

    }
}
