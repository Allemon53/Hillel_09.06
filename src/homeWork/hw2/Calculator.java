package homeWork.hw2;

    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1, num2, operation);
            System.out.println("Результат:" + " " + result);
        }

        public static int getInt() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число:" + " ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка ввода. Введите целое число:" + " ");
                scanner.next();
            }
            int number = scanner.nextInt();
            return number;
        }

        public static char getOperation() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите операцию (+, -, * или /): ");
            char operation = scanner.nextLine().charAt(0);
            while (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
                System.out.print("Ошибка ввода. Введите операцию (+, -, * или /): ");
                operation = scanner.nextLine().charAt(0);
            }
            return operation;
        }

        public static int calc(int num1, int num2, char operation) {
            int result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            return result;
        }
    }