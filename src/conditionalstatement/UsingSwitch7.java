package conditionalstatement;

public class UsingSwitch7 {

    public static void main(String[] args) {

        //switch statement allows a variable to be tested for equality against a lost of value

        String day = "Friday";

        switch (day) {
            case "Sunday" :
                System.out.println("This is " + day + " today!");
                break;
            case "Monday" :
                System.out.println("This is " + day + " today!");
                break;
            case "Tuesday" :
                System.out.println("This is " + day + " today!");
                break;
            case "Wednesday" :
                System.out.println("This is " + day + " today!");
                break;
            case "Thursday" :
                System.out.println("This is " + day + " today!");
                break;
            case "Friday" :
                System.out.println("This is " + day + " today!");
                break;
            default:
                System.out.println("This is not a day Sorry!");
        }


    }
}
