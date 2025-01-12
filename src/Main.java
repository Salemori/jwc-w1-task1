import Loops.ConditionalsLoopTask;
import MethodPractice.MethodTask;

public class Main {
    public static void main(String[] args) {
        // Step 1:
        int age = 24;
        long number = 3450280L;
        float rate = 34.25f;
        double price = 356.753620;
        char gender = 'F';
        boolean isActive = true;
        String firstName = "Aduragbemi";


        // Step 2:
        System.out.println("------------------------------ Variables and Operators Task Print ---------------------------");
        System.out.printf("Initial Values:%n age: %d%n number: %d%n rate: %f%n " +
                "price: %f%n gender: %c%n Is Active: %b%n First Name: %s%n%n"
                , age,number,rate,price,gender,isActive,firstName);

        //Step 3:
        System.out.printf("Modified Values:%n age: %d%n number: %d%n rate: %f%n " +
                        "price: %f%n gender: %c%n Is Active: %b%n Full Name: %s%n"
                , age - 20,
                number / 100,
                rate * (10.0/100.0),
                price % 2,
                gender = 'M',
                isActive = false,
                firstName + " Oduntan");


        // Task 1:
        System.out.println("------------------------------ Method Practice Task Print ---------------------------");
        MethodTask.greetings("Aduragbemi", "Oduntan");

        //Task 2:
        System.out.printf("%f%n", MethodTask.circleArea(9));

        //Task 3:
        System.out.printf("%f%n", MethodTask.multiplyNumbers(50, 10));
        System.out.printf("%f%n", MethodTask.multiplyNumbers(50, 10, 2));

        //Task 4:
        System.out.printf("%f%n", MethodTask.largestNumber(5000, 11000, 9000));


        System.out.println("------------------------------ Loops Task Print ---------------------------");
        // Task 1:

        System.out.print(ConditionalsLoopTask.twelveDaysOfChristmas(13) + "\n");
        System.out.print(ConditionalsLoopTask.twelveDaysOfChristmas(7) + "\n");

        int i = 1;
        while (i <= 12)
        {
            System.out.print(ConditionalsLoopTask.twelveDaysOfChristmas(i) + "\n");
            i++;
        }

    }
}