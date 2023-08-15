package ua.hillel.lesson.lesson14.classes.iner;

public class Outer {
    int num;
    void showInner(){
        InnerDemo innerDemo = new InnerDemo();
        innerDemo.print();
    }
    private class InnerDemo{
        public void print(){

            System.out.println("Это внетрений класс");
        }
    }
}
