package Lecture04;


import java.util.Scanner;

public class InputReader {

    private Scanner scanner;

    public String readNameFromConsole(){
        this.scanner = new Scanner(System.in);
        System.out.println("Enter Person name: ");
        String name = scanner.nextLine();
        return name;
    }

    public String readAgeFromConsole(){
        System.out.println("Enter Person age: ");
        return this.scanner.nextLine();
    }
}
