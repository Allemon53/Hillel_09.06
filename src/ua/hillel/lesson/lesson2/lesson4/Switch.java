package ua.hillel.lesson.lesson2.lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    condition();
    }
    public static void condition(){
        System.out.println("Enter number 1, 2 or 3");
        Scanner scanner = new Scanner(System.in);
        int yourWeekend = scanner.nextInt();
        switch (yourWeekend){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("----");
        }
    }
}
