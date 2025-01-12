package MethodPractice;

public class MethodTask {


    public static void greetings(String firstName, String lastName)
    {
        System.out.printf("Hi! %s %s, Welcome to Java class.\n", firstName, lastName);
    }

    public static double circleArea(double radius)
    {
        return (Math.PI * Math.pow(radius, 2));
    }

    public static double multiplyNumbers(double numOne, double numTwo)
    {
        return numOne * numTwo;
    }

    public static double multiplyNumbers(double numOne, double numTwo, double numThree)
    {
        return numOne * numTwo * numThree;
    }

    public static double largestNumber(double numOne, double numTwo, double numThree)
    {
        return Math.max(numOne, Math.max(numTwo, numThree));
    }

}
