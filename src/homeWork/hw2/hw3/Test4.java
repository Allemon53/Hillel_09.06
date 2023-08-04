package homeWork.hw2.hw3;

import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        System.out.println("Enter any phrase and Enter anu two digit");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        int numberIn1 = scanner.nextInt();
        int numberIn2 = scanner.nextInt();
        int result = numberIn1 + numberIn2;
        System.out.println("You enter phrase " + phrase + " " + result);
    }
}
