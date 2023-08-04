package ua.hillel.lesson.exeption;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleExeptionExample {
    public static void main(String[] args) throws IOException {
        structureExample3();
    }
    static void structureExample3() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {3, 4, 5};
        try {
            System.out.println(a[b] / 0);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Something happened ");
        }
    }
    static void structureExample2() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {3, 4, 5};
        try {
            System.out.println(a[b] / 0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Unknown array index ");
        } catch (ArithmeticException e){
            System.out.println("devision on null");
        }
    }

    static void structureExample() {
        try {
            FileWriter fileWriter = new FileWriter("text.txx");
            fileWriter.close();
            //         fileWriter.write("hello");
        } catch (IOException u) {
            System.out.println("Чувак открой поток");
        } finally {
            System.out.println("выполняется блок файнели");
        }
    }

    static void structureException() {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("нельзя делить на ноль");
        }
        System.out.println("Дальнейший код");
    }
}
