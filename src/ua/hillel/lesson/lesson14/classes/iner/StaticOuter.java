package ua.hillel.lesson.lesson14.classes.iner;

public class StaticOuter {
    int num;
    static class InnerDemo{
        public void my_print(){
            System.out.println("Это внетрений static класс");
        }
    }
}
