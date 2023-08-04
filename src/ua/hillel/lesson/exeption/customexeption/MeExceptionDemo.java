package ua.hillel.lesson.exeption.customexeption;

public class MeExceptionDemo {
    public static void main(String[] args) {
        try {
            comput(7);
        }catch (MyException e){
            System.out.println("hello");

        }
    }
    static void comput(int a) throws MyException{
        if (a>10){
            throw new MyException("some message", a);
        }
        System.out.println("дальнейшее использование програмы");
    }
}
