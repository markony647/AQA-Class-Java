package Lecture03;


import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {

        Container container = new Container();
        InputReader readInput = new InputReader();

        while (!container.isFull()) {

            String value = readInput.readInputFromConsole();
            if (Validator.isValid(value)) {
                int numericValue = Converter.convertStringToInt(value);
                    container.addToArray(numericValue);
                    System.out.println(numericValue + " was added to the array.");
                } else {
                System.out.println("Only numbers allowed. The number should be less 10. The value " + value +
                        " was not added.");
            }
        }

        System.out.println("The array is full.");
        System.out.println(container);
    }

}
