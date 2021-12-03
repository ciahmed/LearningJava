package digintojava;

import java.util.Scanner;

public class UsingNestedLoops13 {

    public static void main(String[] args) {

        //nested loop is a loop inside a loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter a # of rows you want");
        rows = scanner.nextInt();

        System.out.println("Enter a # of columns you want");
        columns = scanner.nextInt();

        System.out.println("Enter a symbol you want to use");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++) {
            System.out.println();
            for(int j=1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }


    }
}
