package digintojava;

import java.util.Scanner;

public class UsingWhileLoop10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {

            System.out.print("Please enter your name");
            name = scanner.nextLine();
        }

        System.out.println("Yo bro your name is " + name);

    }
}
