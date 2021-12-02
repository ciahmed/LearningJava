package operators;

public class LogicalOperators9 {

    public static void main(String[] args) {

        //&& = AND --> both condition must be true
        //|| = OR --> either condition must be true
        //! = NOT --> reverses the value of a condition

//        Using &&
//        int score = 101;
//        String grade;
//
//        if (score>=90 && score<=100) {
//            grade = "A";
//        } else {
//            grade = "F";
//        }
//
//        System.out.println("My score is " + score);
//        System.out.println("My grade is " + grade);

//        Using ||
//        int score = 91;
//        String grade;
//
//        if (score==90 || score ==80) {
//            grade = "A";
//        }else {
//            grade ="not determined";
//        }
//
//        System.out.println("My score is " + score);
//        System.out.println("My grade is " + grade);


//        Using !
        int score = 100;
        String grade;

        if (score!=90 && score==100) {
            grade = "A";
        }else {
            grade ="not determined";
        }

        System.out.println("My score is " + score);
        System.out.println("My grade is " + grade);


    }
}
