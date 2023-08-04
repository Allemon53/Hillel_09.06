package homeWork.hw2.hw3;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        System.out.println("Enter number 1, 2 or 3");
        Scanner scanner = new Scanner(System.in);
        int yourWeekend = scanner.nextInt();

        if (yourWeekend == 1){
            System.out.println("You have weekend");
        }
        else if (yourWeekend == 2){
            System.out.println("You have weekend");
        }
        else if (yourWeekend == 3){
            System.out.println("You have weekend");
        }
        else {
            System.out.println("You don`t have days off");
        }
    }
}
