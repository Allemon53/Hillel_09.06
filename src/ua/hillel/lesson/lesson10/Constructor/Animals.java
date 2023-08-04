package ua.hillel.lesson.lesson10.Constructor;

import java.security.PublicKey;

public class Animals {
    public Animals(String name, String age){
        this.age = age;
        this.name = name;
    }
    public Animals(){

    }
    private String name;
    private String age;

    void sayHello(){
        System.out.println("hello");
    }
    void sayName(){
        System.out.println(this.name);
    }
    void sayAge(){
        System.out.println(this.age);
    }
}
