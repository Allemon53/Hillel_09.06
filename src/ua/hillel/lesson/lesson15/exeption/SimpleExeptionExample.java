package ua.hillel.lesson.lesson15.exeption;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleExeptionExample {
    public static void main(String[] args) {
        exceptionExample2();
    }

    static void exceptionExample3() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {3, 4, 6};

        try {
            System.out.println(a[b] / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Something happened");
        }
    }

    static void exceptionExample2() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {3, 4, 6};

        try {
            System.out.println(a[b] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unknown array index");
        } catch (ArithmeticException e) {
            System.out.println("Division on null");
        }
    }


    static void exceptionExample() {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.close();
            fileWriter.write("Hello");
        } catch (IOException u) {
            System.out.println("Чувак, открой поток!!!!!!");
            u.printStackTrace();
        } finally {
            System.out.println("Выполняется блок finally");
        }
        System.out.println("Дальнейшее выполнение программы");
    }


    static void structureException() {
        try {
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println("Нельзя делить на ноль");
        }
        System.out.println("Дальнейший код");
    }
}
