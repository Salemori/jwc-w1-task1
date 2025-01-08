
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

    }
}