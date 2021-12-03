package digintojava;

import java.util.Scanner;

public class UsingDoLoop11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.print("Please enter your name");
            name = scanner.nextLine();
        }while(name.isBlank());

        System.out.println("Yo bro your name is " + name);

    }
}
