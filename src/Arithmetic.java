import java.util.*;
import java.util.stream.Collectors;

public class Arithmetic {

    public static int countDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[matrix.length - 1 - i][i];
            }
        }
        return sum;
    }

    public static void moveZeroes(int[] array){
        int length = array.length;
        int count = 0;
        for (int i = 0; i < length; i++){
            if (array[i] == 0){
                for (int j = i + 1; j < array.length; j++){
                    array[j-1] = array[j];
                }
                array[array.length-1] = 0;
                length--;
                i--;
            }
        }
    }
    public static List<String> trimAndReverse(List<String> names){
        int i = 0;
        for (String name:names){
            names.set (i, name.substring (1));
            i++;
        }
        Collections.reverse (names);
        return names;
    }
    public static List<String> trimAndReverseStream(List<String> names){
        return names   .stream ()
                .map (x->x.substring (1))
                .sorted()
                .collect(Collectors.toList());
    }
    public static Integer[] reverseArray(Integer[] array) {
        int length = array.length;
        int temp;
        for (int i = 0; i < length/2; i++) {
            temp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = temp;
        }
        return array;
    }
    public static Integer[] reverseArrayList(Integer[] array){
        int length = array.length;
        List<Integer> list = Arrays.asList (array);
        Collections.reverse (list);
        return list.toArray (new Integer[length]);
    }
    public static boolean isPalindrome(String string){
        char[] charArr = string.toLowerCase(Locale.ROOT).toCharArray ();
        for (int i = 0; i < charArr.length/2; i++){
            if (charArr[i] != charArr[charArr.length-1-i]){
                System.out.println (charArr[i] + "!=" + charArr[charArr.length-1-i]);
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindromeBuilder (String string){
        string=string.toLowerCase ();
        StringBuilder stringBuilder = new StringBuilder ();
        stringBuilder.append (string);
        System.out.println (stringBuilder.reverse ());
        return stringBuilder.toString ().equals (string);
    }
    public static void sortBubble(int[] array){
        int length = array.length;
        int index=0;
        while (length > 1){
            int max = array[0];
            for (int i = 0; i < length; i++){
                if (array[i] >= max){
                    max = array[i];
                    index = i;
                }
            }
            array[index] = array[length-1];
            array[length-1] = max;
            length--;
        }
    }
    public static void sortShuttle (int[] array){
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i+1] < array[i]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temp;
                    flag = true;
                }
            }
        }
    }
}
