package ua.hillel.lesson.lesson2.lesson4.loops;

public class LoopsExemple {

    public static void main(String[] args) {
        whileExample2();
    }

    public static void whileExample3() {
        int i = 1;
        do {
            i++;
            System.out.println(i + "");
        } while (i < 4);

    }

    public static void whileExample() {
        int i = 1;
        while (i <= 8) {
            System.out.println(i + " ");
            i++;
        }

    }


    public static void whileExample2() {
        int i = 100;
        while (i >= 10) {
            System.out.println("обратный отчет" + i + " ");
            i -= 10;
        }

    }

    public static void forExample() {
        for (int i = 3; i >= -3; i--) {
            System.out.println("oleg" + " " + i);
        }

    }

    public static void forExampleWitchArray() {

        int[] arr = {2, 4, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void forEachExampleWitchArray() {

        int[] arr = {2, 4, 6};
        for (int i : arr){
            System.out.println(i);
        }
    }
}
