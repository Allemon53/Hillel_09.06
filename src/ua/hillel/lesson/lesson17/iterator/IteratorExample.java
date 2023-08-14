package ua.hillel.lesson.lesson17.iterator;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {
    public static void main(String[] args) {

    }
    static void iteratorFailSafe(){
        List<Integer> integerList = new CopyOnWriteArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Iterator<Integer> integerIterator = integerList.iterator();

        while (integerIterator.hasNext()){
            Integer nextInteger = integerIterator.next();
            if (nextInteger.equals(2)){
                integerList.remove(10);
            }
            System.out.println(nextInteger + " ");
        }
        System.out.println("\n" + integerList);
    }
    static void iteratorFailFast(){
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Iterator<Integer> iteratorIterator = integerList.iterator();

        while (iteratorIterator.hasNext()){
            Integer nextInteger = iteratorIterator.next();
            if (nextInteger.equals(2)){
                integerList.remove(2);
            }
            System.out.println(nextInteger + " ");
        }
        System.out.println("\n" + integerList);
    }
}
