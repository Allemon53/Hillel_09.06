package homeWork.hw2;

public class Test17 {
    public static void main(String[] args) {
        findLuckyNumber();
    }
        public static boolean isLuckyNumber(int number) {
            return number == 3;
        }
        public static void findLuckyNumber() {
            for (int number = 1; number <= 10; number++) {
                if (isLuckyNumber(number)) {
                    System.out.println("Вот счастливое число!");
                    break;
                } else {
                    System.out.println("Проверяем число " + number + "...");
                }
            }
        }
    }