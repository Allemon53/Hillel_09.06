package ua.hillel.lesson.lesson12.aboutstatic;

public class AboutBreak {
    public static void main(String[] args) {

        breakExample2();
    }

    public static void breakExample2() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("первый цикл " + i);
            for (int k = 1; k <= 20; k++) {
                System.out.println("Это первый цикл. Выполняется " + k + " раз");
                if (k == 2)
                    break;
            }
        }
    }

    public static void breakExample() {
        int a = 1;
        int b = 3;

        while (a <= 5) {
            System.out.println(a + " итерация цикла");
            if (a == b) {
                break;
            }
            a++;
        }
    }
}
