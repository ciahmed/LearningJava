package conditionalstatement;

public class UsingSwitch7 {

    public static void main(String[] args) {

        //switch statement allows a variable to be tested for equality against a lost of value

        String day = "Friday";

        switch (day) {
            case "Sunday" :
                System.out.println("This is Sunday today!");
                break;
            case "Monday" :
                System.out.println("This is Monday today!");
                break;
            case "Tuesday" :
                System.out.println("This is Tuesday today!");
                break;
            case "Wednesday" :
                System.out.println("This is Wednesday today!");
                break;
            case "Thursday" :
                System.out.println("This is Thursday today!");
                break;
            case "Friday" :
                System.out.println("This is Friday today!");
                break;
            default:
                System.out.println("This is not a day Sorry!");
        }


    }
}
