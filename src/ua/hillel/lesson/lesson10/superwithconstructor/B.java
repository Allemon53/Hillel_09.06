package ua.hillel.lesson.lesson10.superwithconstructor;

public class B extends A {
    public B(){
        System.out.println("B Метод построения без параметров");
    }
    public B(int value){
        super(199);
        System.out.println("B Метод построения c параметров"+ value);
    }
}
