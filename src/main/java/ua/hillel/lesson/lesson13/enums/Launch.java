package ua.hillel.lesson.lesson13.enums;

public class Launch {
    public static void main(String[] args) {

    }
    public void goToMenu(BorderMenu borderMenu){
        switch (borderMenu){
            case MAIN -> System.out.println("go to menu");
            case PRODUCTS -> System.out.println("go to prodacts");
            case CONTACS -> System.out.println("go to contacs");
        }
    }
}
