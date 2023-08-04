package ua.hillel.lesson.lesson2.lesson3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        method3();
    }

    public static void method2(){
        System.out.println("Enter anu two digit");
        Scanner scanner = new Scanner(System.in);
        int numberIn1 = scanner.nextInt();
        int numberIn2 = scanner.nextInt();
        int result = numberIn1 + numberIn2;
        System.out.println(result);
        
        
    }
    public static void method1(){
        System.out.println("Enter any digit from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int numberIn = scanner.nextInt();
        int result = numberIn + 100;
        System.out.println("You enter "+ numberIn);
        System.out.println("Result "+ result);
    }
    public static void method3(){
        System.out.println("Enter any phrase");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        System.out.println("You enter phrase " + phrase);
    }

}
