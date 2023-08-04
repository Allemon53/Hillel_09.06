package ua.hillel.lesson.lesson10.superwithconstructor;

public class A {
    public A(){
        System.out.println("Метод построения без параметров");
    }
    public A(int value){
        System.out.println("Метод построения c параметров" +value);
    }
}
