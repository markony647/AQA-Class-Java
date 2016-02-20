package Lecture05;


public class Validator {

    public static boolean isCharactersOnly(String name) {

        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isNumeric(String age) {
        try {
            Converter.convertFromStringToInt(age);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isCorrectAgeRange(String ageValue){
        return (Converter.convertFromStringToInt(ageValue) > 4 && Converter.convertFromStringToInt(ageValue) < 100);
    }


    public static boolean isValidPerson(String name, String age) {
        return ((isCharactersOnly(name) && isNumeric(age)) && (isCorrectAgeRange(age)));
    }

    public static boolean containsName(Person [] arrayOfPersons, String nameSearchParameter) {

        for (int i = 0; i < arrayOfPersons.length; i++) {
            if (arrayOfPersons[i].getName().equals(nameSearchParameter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsAge(Person[] arrayOfPersons, int ageSearchParameter) {

        for(int i = 0; i < arrayOfPersons.length; i++) {
            if(arrayOfPersons[i].getAge() == ageSearchParameter) {
                return true;

            }
        }
        return false;
    }
}