import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfStringNumbers {

    public static Integer calculateSum(String input){
        Integer figure = Integer.valueOf (input);
        Integer sum = 0;
        for (int i = 0; i < input.length (); i++) {
            sum += figure % 10;
            figure = figure / 10;
        }
        return sum;
    }

    public static Integer calculateSumChar(String input){
        char[] chars = input.toCharArray ();
        Integer sum = 0;
        for (char c:chars){
        }
        for (int i = 0; i < chars.length; i++){
            sum += Character.getNumericValue (chars[i]);
        }
        return sum;
    }
}
