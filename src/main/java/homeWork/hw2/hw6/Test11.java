package homeWork.hw2.hw6;

public class Test11 {
        public static void main(String[] args) {
            int index = 5;
            for (int i = 1; i <= index ; i++) {
                for (int j = 1; j <= index - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i  - 1; k++) {
                    System.out.print(" *");
                }
                System.out.println(" ");
            }
        }
}