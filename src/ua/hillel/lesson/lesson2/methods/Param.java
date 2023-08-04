package ua.hillel.lesson.lesson2.methods;

public class Param {
    public static void main(String[] args) {
    sum(5,10);
    sayName("Oleg", "Maks");
    sayNameAndAge("Oleg", 30);
    sayNameAndAge2("Oleg", 36);
    }

    public static void sum(int number1, int number2){
    int result = number1+number2;
        System.out.println(result);
    }

    public static void sayName(String name, String name2){
        System.out.println(name + " "+ name2);
    }

    public static void sayNameAndAge(String name, int age){
        System.out.println(name + " "+ age);
    }

    public static void sayNameAndAge2(String name, int age){
        if (age==33){
            System.out.println(name + " "+  age);
        }else {
            System.out.println("i don`t know");
        }
    }
}
