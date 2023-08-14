package ua.hillel.lesson.lesson15.exeption.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        methods();
        methodGet();
        methodIndexOf();
        methodSet();
        methodRemoveByIndex();
        methodIndexOf();
        methodRemoveByObject();
        methodIndexOf();

    }
    static List<String> myArrayList;

    public static void methodRemoveByObject(){
        myArrayList.remove("Alex");
    }
    public static void methodRemoveByIndex(){
        myArrayList.remove(1);
    }
    public static void methodSet(){
        myArrayList.set(1, "Oleg");

    }
    public static void methodIndexOf(){
        System.out.println(myArrayList.indexOf("Alex"));
        System.out.println(myArrayList.indexOf("Oleg"));
    }
    public static void methods(){
       myArrayList = new ArrayList<>();
        myArrayList.add("Alex");
        myArrayList.add("Oleg");
        myArrayList.add("Vova");
    }
    public static void methodGet(){
        String e = myArrayList.get(1);
        System.out.println(e);
    }
    public static void syntaxis(){
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();
    }
}
