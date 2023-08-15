package ua.hillel.lesson.lesson2.methods;

public class MethodsSTR {
    public static void main(String[] args) {
        stringLength();
    }

    public static void stringLength(){
        String str = "Hello world";
        System.out.println(str.length());
    }

    public static void stringConcat(){
        String str = "Hello world";
        String str2 = "Maks";
        String result = str.concat(str2);
        System.out.println(result);
    }
    public static void stringTrim(){
        String str = "      Hello world     ";
        String str2 = "Maks";
        System.out.println(str.trim());
        System.out.println(str2.trim());
    }

    public static void stringAndWith(){
        String str = "Hello world";
        boolean end1 = str.endsWith("World");
        boolean end2 = str.endsWith("Oleg");
        System.out.println(end1);
        System.out.println(end2);
    }

    public static void stringToUpperCase(){
        String str = "Hello world".toUpperCase();
        System.out.println(str);
    }

    public static void stringEquals(String str, String str2) {

        if (str.equals(str2)) {
            System.out.println("Str are equals");
        } else {
            System.out.println("don`t equals");
        }
    }

    public static void stringContains() {
        String str = "Hello world";
        if (str.contains("world")) {
            System.out.println("Str are contains");
        } else {
            System.out.println("don`t contains");
        }
    }

    public static void stringCharAt(){
        String str ="Hello world";
        System.out.println(str.charAt(1));
    }

    public static void stringIndexOf(){
        String str ="Hello world";
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));
    }

    public static void stringSubstring(){
        String str ="Hello world";
        System.out.println(str.substring(4, 7));
    }

    public static void stringReplace(){
        String str ="Hello Maks";
        String str2 = str.replace("Maks", "Oleg");
        System.out.println(str2);
    }

}
