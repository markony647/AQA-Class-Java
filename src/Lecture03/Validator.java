package Lecture03;

public class Validator {

    public static boolean isNumeric(String str) {
        try {
            Converter.convertStringToInt(str);
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

    public static boolean isValid(String str){
        if(isNumeric(str)) {
            int myValue = Converter.convertStringToInt(str);
            if(checkRange(myValue)){
                return true;
            }
        }else {
            return false;
        }
        return false;
    }
}
