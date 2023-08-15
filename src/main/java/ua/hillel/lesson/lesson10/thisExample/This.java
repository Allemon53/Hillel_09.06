package ua.hillel.lesson.lesson10.thisExample;

public class This {
    public int num = 10;
    public int num2 = 20;

    public void print(){
        int num =15;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(this.num2);

    }
    public void print2() {
        int num = 15;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(this.num2);
    }
}
