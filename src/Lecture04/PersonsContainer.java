package Lecture04;


public class PersonsContainer {

    Person arrayOfPersons [] = new Person[5];
    int counter = 0;

    public void addPersonToArray(Person person){
        arrayOfPersons[counter] = person;
        counter++;
    }

    public boolean isFull(){
        return arrayOfPersons.length <= counter;
    }


    public void printArray() {
        int i = 1;
        for(Person p : arrayOfPersons){
            System.out.println(i + ". Person " + p.getName() + " " + p.getAge() + " years old.");
            i++;
        }
    }
}
