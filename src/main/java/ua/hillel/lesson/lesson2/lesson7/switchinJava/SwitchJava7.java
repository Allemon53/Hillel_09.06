package ua.hillel.lesson.lesson2.lesson7.switchinJava;

public class SwitchJava7 {
    public static void main(String[] args) {
        int month = 3;
        String monthString;

        switch (month){
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 7:
                monthString = "July";
                break;
                default:
                    monthString = "Unknown month";
        }
    }
}
