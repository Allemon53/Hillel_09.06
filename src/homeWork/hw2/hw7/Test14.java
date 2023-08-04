package homeWork.hw2.hw7;

import java.util.Random;

public class Test14 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 11;
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;
        System.out.println("Среднее арифметическое: " + average);
    }
}