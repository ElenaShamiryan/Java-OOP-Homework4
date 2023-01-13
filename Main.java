package DZ4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    List<Object> listOfIntegers = new ArrayList(
             Arrays.asList(1, 24, 41, 19, -8, 0, -3, 5, 15, -12));
    List<Object> listOfStrings = new ArrayList(
            Arrays.asList("Дом", "Андрей", "Дмитрий", "Англия", "Акула"));

        IsEven isEven = new IsEven();
        IsPositive isPositive = new IsPositive();
        BeginsWithA beginsWithA = new BeginsWithA();
        BeginsWith beginsWith = new BeginsWith("Д");
        filter(listOfIntegers, isEven);
        filter(listOfIntegers, isPositive);
        filter(listOfStrings, beginsWithA);
        filter(listOfStrings, beginsWith);

    }

    public static <T> Iterable<T> filter(Iterable<T> collection, IsGood<T> approver) {
        List<T> newCollection = new ArrayList<>();
        for (T item : collection) {
            if (item instanceof Integer) {

                if (approver.isGood(item)) {
                    newCollection.add(item);
                }
            }

            if (item instanceof String) {

                if (approver.isGood(item)) {
                    newCollection.add(item);
                }
            }

        }
        System.out.println(newCollection);
        return newCollection;
    }
}