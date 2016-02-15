package Lecture04;


public class TestPersonClass {
    public static void main(String[] args) {

        InputReader inputReader = new InputReader();
        PersonsContainer personsContainer = new PersonsContainer();

        while (!personsContainer.isFull()) {
            String name = inputReader.readNameFromConsole();
            String rawAge = inputReader.readAgeFromConsole();
            if(Validator.isValidPerson(name, rawAge)) {
                int age = Converter.convertFromStringToInt(rawAge);
                Person person = new Person(name, age);
                personsContainer.addPersonToArray(person);
                System.out.println("The Person " + person.getName() + " " + person.getAge() + " years old was" +
                        " added to the array");
            } else {
                System.out.println("Please, enter correct name and age. The Person with name " + name + " and age "
                        + rawAge +  " can't be added." );

            }
        }
        System.out.println("The container is full. The Persons list is: ");
        personsContainer.printArray();
    }
}



