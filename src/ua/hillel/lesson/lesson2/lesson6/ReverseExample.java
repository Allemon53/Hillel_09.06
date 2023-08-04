package ua.hillel.lesson.lesson2.lesson6;

public class ReverseExample {
    public static void main(String[] args) {
        reverse();
    }

    public static void reverse(){
        String[] str = {"hello", "my", "name", "is", "oleg"} ;
        int n = str.length;
        String temp;

        for (int i = 0; i<n/2; i++){
            temp = str[n-i-1];
            str[n-i-1]= str[i];
            str[i]= temp;
        }
        for (String i :str){
            System.out.print(i + " ");
        }
    }
}
