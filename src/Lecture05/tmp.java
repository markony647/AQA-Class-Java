package Lecture05;




import java.util.ArrayList;

public class tmp {

    public static void main(String[] args) {
        PersonsContainer personsContainer = new PersonsContainer();
        Person person = new Person("Ivan", 25);
        Person person1 = new Person("Cat", 25);
        Person person2= new Person("Sam", 44);
        Person person3 = new Person("Ivan", 78);

        Person[] persons = new Person[3];
        persons[0] = person;
        persons[1] = person1;
        persons[2] = person2;

        ArrayList<Person> personsArray = new ArrayList<>();
        personsArray.add(person);
        personsArray.add(person1);
        personsArray.add(person2);

        boolean validName = containsName1(personsArray, "Sam");
        System.out.println(validName);
    }

    public static boolean containsName1(ArrayList<Person> personsArr, String nameSearchParameter) {

        for (Person p : personsArr) {
            if (p.getName().equals(nameSearchParameter)) {
                return true;
            }
        }
        return false;
//    }
//
//        for(int i=0; i < persons.length(); i++) {
//            if(persons[i].getName().equals(nameSearchParameter)){
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return true;
    }
}
