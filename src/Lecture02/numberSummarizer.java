package Lecture02;

import java.util.Scanner;

public class numberSummarizer {

    public static void main(String[] args) {

        Scanner scannerFirst = new Scanner(System.in);
        System.out.println("Enter please first argument: ");
        double firstArgument = convertToDouble(scannerFirst);


        System.out.println("Enter please second argument: ");
        Scanner scannerSecond = new Scanner(System.in);
        double secondArgument = convertToDouble(scannerSecond);

        double result = sum(firstArgument, secondArgument);
        System.out.println(firstArgument + " + " + secondArgument + " = " + result);

    }


    //Adds two numbers
    public static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    //Converts String to double if the value is numeric. If not - returns 0.0 as a default value
    public static double convertToDouble(Scanner scanner) {
        String arg = scanner.nextLine();
        if(isNumeric(arg)) {
            double argument = Double.parseDouble(arg);
            return argument;
        } else {
            System.out.println("Only numbers allowed");
            return 0.0;
        }
    }



    // Checks whether the value is numeric (method was copied from stakeoverflow)
    public static boolean isNumeric(String str)
    {
        try {
            double d = Double.parseDouble(str);
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}

