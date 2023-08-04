package ua.hillel.lesson.lesson2.lesson6;

public class SomeStringMethod {
    public static void main(String[] args) {
        int num = 234;
        Integer num1 = 345;

    }

    public static void parseIntExample(){
        String actual = "3455";
        int num = Integer.parseInt(actual);
        System.out.println(num == 3455);

    }

    public static void parseInt2Example(){
        String actual = "3455";
        int num = Integer.parseInt(actual);
        System.out.println(num == 3455);

    }
    public static void equalsIgnoreCaseExample(String str1, String str2){
        if(str1.equals(str2)){
            System.out.println("str are eaquls");
        }else {
            System.out.println("doesn`t eaquals");
        }

    }
    public static void valueOfExample(){
        String actual = "3455";

        int num = 3455;
        String str = String.valueOf(num);
        System.out.println(str);
    }
    public static void valueOffExample(){
        String actual = "3455";

        int expected = 3455;
        String expectedStr = String.valueOf(expected);
        System.out.println(actual.equals(expectedStr));
    }
    public static void lastIndexOfExample(String str1, String str2){
        String str ="hello me name is oleg";
        System.out.println(str.indexOf("my"));
        System.out.println(str.lastIndexOf("le"));
    }

    public static void equalsExample(String str1, String str2){
        if(str1.equals(str2)){
            System.out.println("str are eaquls");
        }else {
            System.out.println("doesn`t eaquals");
        }
    }
}
