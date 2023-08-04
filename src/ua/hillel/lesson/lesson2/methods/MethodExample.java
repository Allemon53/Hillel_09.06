package ua.hillel.lesson.lesson2.methods;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println(plus());
        int minus = plus()-1;
        System.out.println(minus);
    }
    public static String returnHelloImper(){
        String helloStr ="Hello";
        return helloStr;

    }
    public static String returnHelloDeclar(){
        return "hello";

    }
    public static int plus(){
        int result = 2+2;
        return result;

    }






}
