package ua.hillel.lesson.lesson15.exeption.customexeption;

public class MyException extends Exception {

    private int detail;

    public MyException(String message, int detail) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
