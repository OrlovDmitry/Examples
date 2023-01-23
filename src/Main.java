import org.w3c.dom.Node;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {

        
        // Паттерн Строитель - Wife
//        Wife mainWoman = new Wife.WifeBuilder("Irina", "Bliznets").setBoobsSize (3).setAssDescription ("Amazing").isFuckInAss (false).build ();
//        System.out.println (mainWoman);

        // Паттерн Композиция - Insect
//        Insect bee1 = new Bee ()
        // Паттерн Стратегия
//        Auto_Strategy audi = new Audi ();
//        audi.setFillStrategy (new GasFilling ());
//        audi.fill ();
//        Animal cat = new Cat ("Barsik");
//        double pi = Math.PI;
//        int x = Cat.x;
//        System.out.println (cat.getQUANTITY ());
//        Map<String,String > hashMap = new HashMap<> ();
//        hashMap.put ("a","a");
//        hashMap.put ("b", "b");
//        hashMap.put (new String ("a"), "c");
//        hashMap.forEach ((key,value) -> System.out.println (key + ": " + value));
//        List<String> list = Arrays.asList("b", "a", "c");
//        System.out.println (list);
//        Collections.sort (list);
//        System.out.println (list);
//        System.out.println (list.get(1).equals (list.get(2)));
//        System.out.println (list.get(1).hashCode ());
//        int y = 5;
//        Integer x = 10;
//        y = 7;
//        x = 20;
//        System.out.println (y);
//        System.out.println (x);
//        Animal animal = new Cat ("Lion");
//        Cat cat = new Cat ("Kesha");
//        System.out.println (cat.getClass () == animal.getClass ());
//        Thread thread = new Thread ();
//        Integer a = new Integer(5);
//        Integer b = new Integer(5);
//        System.out.println (a.equals (b));
//        int[][] arr1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//        System.out.println(Arithmetic.countDiagonalSum(arr1));
//        int[] array = {234, 33, 123, 4, 5342, 76, 3, 65,
//                3, 5, 35, 75, 255, 4, 46, 48, 4658, 44, 22,
//                678, 324, 66, 151, 268, 433, 76, 372, 45, 13,
//                9484, 499959, 567, 774, 473, 3, 32, 865, 67, 43,
//                63, 332, 24, 1};
//        Arithmetic.sortShuttle (array);
//        System.out.println (Arrays.toString (array));
//        StringBuilder stringBuilder = new StringBuilder ("Hello");
//        String string = new String ("hello");
//        stringBuilder.append ("asdf");
//        string.toUpperCase ();
//        System.out.println (stringBuilder);
//        System.out.println (string);
//        Integer y = 5;
//        int x = 5;
//        x++;
//        y++;
//        System.out.println ("x=" + x);
//        System.out.println ("y=" + y);
//        System.out.println (addNumbers (1,2));
        // Пример показывает, что equals () и hashCode () не используются в TreeMap
        // При одинаковых ключах "Bobik" и "Kesha", значение ключа "Bobik" перезаписывается 9 -> 8
//        Map<Animal, Integer> animals = new TreeMap<> ((o1,o2) -> o1.getName ().length () - o2.getName ().length ());
//        animals.put(new Animal("Barsik",7),7);
//        animals.put(new Animal("Bobik",9),9);
//        animals.put(new Animal("Kesha",8),8);
//        System.out.println (animals);
//        List<Object> objects = new ArrayList<String> ();      // инвариативность
//        Object object = new String ("Hello");                 // нет ошибки
//        recursion ();
//        ------------------
//        LedgerServiceImpl ledgerService = new LedgerServiceImpl ();
//        Long accountFrom = ledgerService.createAccount ();
//        Long accountTo = ledgerService.createAccount ();
//        System.out.println (ledgerService.getBalance (accountFrom));
//        System.out.println (ledgerService.getBalance (accountTo));
//        ledgerService.addMoney (accountFrom, BigDecimal.valueOf (1000));
//        System.out.println (ledgerService.getBalance (accountFrom));
//        ledgerService.transferFunds (accountFrom,accountTo, BigDecimal.valueOf (300));
//        System.out.println (ledgerService.getBalance (accountFrom));
//        System.out.println (ledgerService.getBalance (accountTo));
//        -------------------
//        System.out.println (SumOfStringNumbers.calculateSum ("123"));
//        System.out.println (SumOfStringNumbers.calculateSumChar ("123"));
//        Semaphore s = new Semaphore ();
    }
//    public static int addNumbers(int A, int B){
//        return (A + B);
//    }
//    public static void recursion (){
//        recursion ();
//    }
}
