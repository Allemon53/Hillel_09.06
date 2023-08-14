package ua.hillel.lesson.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fifo {
    public static void main(String[] args) {

    }
    static void LuinkedListQ(){
        Queue<Integer> integerQueue = new  LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);

        for (Integer i : integerQueue){
            System.out.println(i);
        }
    }
}
