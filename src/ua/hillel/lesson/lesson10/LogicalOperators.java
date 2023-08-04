package ua.hillel.lesson.lesson10;

public class LogicalOperators {
    public static void main(String[] args) {
        twoOperatorAnd();
    }

    public static void oneOperator() {
        int mouse = 5;
        int weight = 45;

        if (mouse != 0 & weight < 100) {
            System.out.println("Можно кормить кота");
        }
    }

    public static void oneOperatOr() {
        int mouse = 5;
        int weight = 45;

        if (mouse == 7 | weight < 100) {
            System.out.println("Можно кормить кота");
        }
    }

    public static void twoOperatorAnd() {
        int a = 10;
        if (++a == 10 && ++a == 12) {
            ++a;
        }
        System.out.println(a);
    }
}

