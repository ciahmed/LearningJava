package oops;

public class Master {

    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.year);
        System.out.println(myCar.color);
        System.out.println(myCar.price);
        System.out.println("-----------");

        myCar.drive();
        myCar.brakes();
    }
}
