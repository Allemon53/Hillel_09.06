package ua.hillel.lesson.lesson2.lesson7;

import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Max: " + max);
    }
}
