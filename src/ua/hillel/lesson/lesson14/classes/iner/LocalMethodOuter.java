package ua.hillel.lesson.lesson14.classes.iner;

public class LocalMethodOuter {
    void mylocalMethod(){
        int num = 999;
        class MethodInnerClass{
            public void print(){

                System.out.println("это внутрений класс метода" + num);
            }
        }
        MethodInnerClass methodInnerClass = new MethodInnerClass();
        methodInnerClass.print();
    }
}
