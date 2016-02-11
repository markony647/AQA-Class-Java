package Lecture03;


import java.util.Arrays;

public class Container {

    int counter = 0;
    int[] arrayOfNumbers = new int[10];

    public void addToArray(int value){
        arrayOfNumbers[counter] = value;
        counter++;
    }

    public boolean isFull(){
        return arrayOfNumbers.length <= counter;
    }

    @Override
    public String toString() {
        return "Container{" +
                "counter=" + counter +
                ", arrayOfNumbers=" + Arrays.toString(arrayOfNumbers) +
                '}';
    }
}
