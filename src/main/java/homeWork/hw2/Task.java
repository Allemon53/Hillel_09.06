package homeWork.hw2;

public class Task{
        public static void main(String[] args) {
            // Создаем массив от 1 до 10
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }

            // Заменяем четные элементы на 'Y'
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arr[i] = (int) 'Y';
                }
            }

            // Выводим результат в консоль
            for (int i = 0; i < arr.length; i++) {
                System.out.print((char) arr[i] + " ");
            }
        }


}
