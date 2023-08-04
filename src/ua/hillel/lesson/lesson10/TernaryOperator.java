package ua.hillel.lesson.lesson10;

public class TernaryOperator {
    public static void main(String[] args) {
        conditionTernary("Oleg");
        conditionTernary("Oleg!  ");
    }

    public void conditionSimple(String str) {
        var lastChar = str.charAt(str.length() - 1);
        if (lastChar == '?') {
            System.out.println("question");
        } else {
            System.out.println("no question");
        }
    }

    public static void conditionTernary(String str) {
        var lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar == '?' ? "question" : "no question");
    }
}
