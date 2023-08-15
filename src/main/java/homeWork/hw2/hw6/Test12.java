package homeWork.hw2.hw6;
public class Test12 {

        public static void main(String[] args) {
            int numberOfLessons = 3;

            for (int lesson = 1; lesson <= numberOfLessons; lesson++) {
                System.out.println("Это " + lesson + "-й урок!");

                if (lesson < 3) {
                    System.out.println("      Я выполнил все домашние задания " + lesson + "-го урока.");
                } else {
                    System.out.println("      Я не выполнил домашние задания " + lesson + "-го урока.");
                }
            }
        }
}