package ua.hillel.lesson.lesson13;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " я выполнюсь перед континиу");
            if (i > 2)
                continue;
            System.out.println("     " + i + "  я выполнюсь 2 раза");
        }
    }
}
