package conditionalstatement;

public class IfElse6 {

    public static void main(String[] args) {

        //if statement performs a block of code if its condition evaluates to be true
        //else statement performs a block of code if its condition evaluates to be false

//        int a = (7>3) ? 1 : 0;
//        System.out.println(a);

//        int a;
//        if (7>3) {
//            a = 1;
//        }else {
//            a = 0;
//        }
//        System.out.println(a);

        int score = 79;
        String grade;

        if (score >= 90) {
            grade = "A";
        }else if (score <= 90 && score >=80) {
            grade = "B";
        }else {
            grade = "C";
        }

        System.out.println("The score is " + score);
        System.out.println("The grade is " + grade);




    }
}
