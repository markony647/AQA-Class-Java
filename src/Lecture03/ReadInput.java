package Lecture03;


import java.util.Scanner;

public class ReadInput {
    private Scanner scanner;

    public String readInputFromConsole(){
        this.scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 10 :");
        String rawInput = scanner.nextLine();

        return rawInput;
    }
}
