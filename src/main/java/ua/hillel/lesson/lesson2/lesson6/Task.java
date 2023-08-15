package ua.hillel.lesson.lesson2.lesson6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Ведите в консоль");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        int count = 0;
        if (phrase.length()!=0){
            count++;
            for( int i= 0; i<phrase.length(); i++){
                if (phrase.charAt(i)==' '){
                    count++;
                }
            }
        }


        System.out.println("вы ввели " + count+ " слов");
    }

}
