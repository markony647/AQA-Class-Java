package Lecture03;


public class Validator {

    public static boolean isNumeric(String str) {
        try {
            int d = Integer.parseInt(str);
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    public static boolean checkRange(int value){
        if(value < 10){
            return true;
        } else {
            return false;
        }

    }
}
