package javabasics;

public class SwappingVariables3 {

    public static void main(String[] args) {
        String x = "Water";
        String y = "Kool-Aid";

        String z;

        z=x;
        x=y;
        y=z;

        System.out.println("x has: " + x);
        System.out.println("y has: " + y);

    }
}
