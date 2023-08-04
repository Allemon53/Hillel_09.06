package ua.hillel.lesson.lesson10.thisExample;

public class B extends A {
    int value =20;
    public void print(){
        int value =30;
        System.out.println(value);
        System.out.println(this.value);
        System.out.println(super.value);
    }
}
