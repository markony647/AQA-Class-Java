package Lecture03;


import java.util.Scanner;

public class ArrayStorageOfConsoleInput {

    public static void main(String[] args) {

        receiveInputAndAddToArray();

    }

    public static void receiveInputAndAddToArray() {
        Scanner scanner = new Scanner(System.in);
        int [] arrayInput = new int[10];

        int i = 0; // counts how many numbers were added to the array
        while (i != 11) {
            System.out.println("Enter a number less than 10 :");
            String enteredValue = scanner.nextLine();
            if(isNumeric(enteredValue)) {
                int input = Integer.parseInt(enteredValue);
                if (input < 10 && i < 10) {
                    arrayInput[i] = input;
                    System.out.println(arrayInput[i] + " was added to the array.");
                    i++;
                } else if (input < 10 && i == 10) {
                    System.out.println("The storage is full! ");
                    System.out.println("Your array is ");
                    printArray(arrayInput);
                    break;
                } else {
                    System.out.println("Only numbers less than 10 allowed");
                    continue;
                }
            } else {
                System.out.println("Only numbers allowed");
                continue;
            }
        }
    }


    //Checks if the input is numeric
    public static boolean isNumeric(String str)
    {
        try {
            int d = Integer.parseInt(str);
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    //prints the array values in 1 line
    public static void printArray(int [] numericArray){

        for (int i=0; i<numericArray.length; i++) {
            System.out.print(numericArray[i]);

        }
    }


}
