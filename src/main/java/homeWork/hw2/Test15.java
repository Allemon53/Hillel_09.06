package homeWork.hw2;

public class Test15 {
        public static void main(String[] args) {
            Object[] arr = new Object[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            for (int i = 0; i < arr.length; i++) {
                if ((int) arr[i] % 2 == 0) {
                    arr[i] = 'Y';
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}