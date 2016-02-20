package Lecture05;


import java.util.ArrayList;

public class PersonsContainer implements Searchable {

    ArrayList<Person>arrayOfPersons = new ArrayList<>();
    ArrayList<Person> arrayOfFoundPersons = new ArrayList<>();


    public void addPersonToArray(Person person){
        System.out.println("The person " + person.getName() + " was added to the storage.");
        arrayOfPersons.add(person);

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
            for (Person p : arrayOfPersons) {
                if (p.getName().equals(searchQuery)) {
                    arrayOfFoundPersons.add(p);
                    System.out.println(searchQuery + " found. He/she is " + p.getAge() + " years old");
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
            for (Person p : arrayOfPersons) {
                if (p.getAge() == age) {
                    arrayOfFoundPersons.add(p);
                    System.out.println(p.getName() + " found (" + p.getAge() +
                            " years old).");
                }
            }
        } else {
            System.out.println("Sorry, can't find Person with " + searchQuery +
                    " age.");
        }
    }
}
