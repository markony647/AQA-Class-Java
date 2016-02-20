package Lecture05;


import java.util.ArrayList;

public class PersonsContainer implements Searchable {

    Person arrayOfPersons [] = new Person[100];
    ArrayList<Person> arrayOfFoundPersons = new ArrayList<>();

    int counter = 0;


    public void addPersonToArray(Person person){
        System.out.println("The person " + person.getName() + " was added to the storage.");
        arrayOfPersons[counter] = person;
        counter++;
    }

    public boolean isFull() {
        return arrayOfPersons.length <= counter;
    }


    public void printArray() {
        int i = 1;
        for(Person p : arrayOfPersons){
            System.out.println(i + ". Person  is " + p.getName() + " " + p.getAge() + " years old.");
            i++;
        }
    }

    public void searchPersonByUserQuery(String searchQuery) {

        if(Validator.isCharactersOnly(searchQuery)) {
            findPersonByName(searchQuery);
        } else if(Validator.isNumeric(searchQuery)) {
            findPersonByAge(searchQuery);
        } else {
            System.out.println("Enter please correct query parameter");
        }
    }

    @Override
    public void findPersonByName(String searchQuery) {
        searchQuery = searchQuery.toLowerCase();

        System.out.println("Search results:");

        if (Validator.containsName(arrayOfPersons, searchQuery)) {
            for (int i = 0; i < arrayOfPersons.length; i++) {
                if (arrayOfPersons[i].getName().equals(searchQuery)) {
                    arrayOfFoundPersons.add(arrayOfPersons[i]);
                    System.out.println(searchQuery + " found. He/she is " + arrayOfPersons[i].getAge() + " years old");
                }
            }
        }   else {
            System.out.println("Sorry, can't find " + searchQuery);
        }
    }


    @Override
    public void findPersonByAge(String searchQuery) {

        int age = Converter.convertFromStringToInt(searchQuery);
        System.out.println("Search results:");

        if(Validator.containsAge(arrayOfPersons, age)) {
            for (int i = 0; i < arrayOfPersons.length; i++) {
                if (arrayOfPersons[i].getAge() == age) {
                    arrayOfFoundPersons.add(arrayOfPersons[i]);
                    System.out.println(arrayOfPersons[i].getName() + " found (" + arrayOfPersons[i].getAge() +
                            " years old).");
                } else {
                    continue;
                }
            }
        } else {

            System.out.println("Sorry, can't find Person with " + searchQuery +
                    " age.");
        }
    }
}
