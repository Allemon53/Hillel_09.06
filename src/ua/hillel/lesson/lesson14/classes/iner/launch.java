package ua.hillel.lesson.lesson14.classes.iner;

public class launch {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showInner();

        LocalMethodOuter localMethodOuter = new LocalMethodOuter();
        localMethodOuter.mylocalMethod();
    }
}
