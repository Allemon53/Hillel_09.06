package ua.hillel.lesson.lesson9.oop.polimorfizm;

public class Cat extends Animal{
    public void sound(){
        System.out.println("May");
    }
    public void aboutCat(){
        sound();
    }

}
