package ua.hillel.lesson.exeption.customexeption;

public class MyException extends Exception {
    private int detail;

    public MyException(String message, int detail){
        super(message);
        this.detail = detail;

    }
}
