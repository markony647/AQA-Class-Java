package Lecture03;

import static Lecture03.Validator.*;

public class TestClass {

    public static void main(String[] args) {

        Container container = new Container();
        ReadInput readInput = new ReadInput();

        while (!container.isFull()) {

            String value = readInput.readInputFromConsole();

            boolean validInput = isNumeric(value);
            if (validInput) {
                int numericValue = Converter.convertStringToInt(value);
                boolean correctRange = checkRange(numericValue);
                if(correctRange){
                    container.addToArray(numericValue);
                    System.out.println(numericValue + " was added to the array.");
                } else {
                    System.out.println("The numbers less than 10 allowed. The number " + numericValue + " was not added to the array.");
                }
            } else {
                System.out.println("Only numbers allowed");
            }
        }
        System.out.println("The array is full.");
        System.out.println(container);
    }
}
