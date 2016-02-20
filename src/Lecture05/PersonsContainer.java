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

        System.out.println("SEARCH RESULTS:\n");

            for (Person p : arrayOfPersons) {
                if (p.getName().equals(searchQuery)) {
                    arrayOfFoundPersons.add(p);
                    System.out.println(searchQuery.toUpperCase() + " found. He/she is " + p.getAge() + " years old.\n");
                }
             }
         }


    @Override
    public void findPersonByAge(String searchQuery) {

        int age = Converter.convertFromStringToInt(searchQuery);
        System.out.println("SEARCH RESULTS:\n");

            for (Person p : arrayOfPersons) {
                if (p.getAge() == age) {
                    arrayOfFoundPersons.add(p);
                    System.out.println(p.getName().toUpperCase() + " found (" + p.getAge() +
                            " years old).\n");
                }
            }
        }
    }
