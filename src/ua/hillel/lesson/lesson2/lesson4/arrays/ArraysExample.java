package ua.hillel.lesson.lesson2.lesson4.arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4};
        String [] arraySt = {"Alex", "Oleg", "Igor"};
        int arrayLangs = array.length;
        System.out.println(arrayLangs);

        int arrayLangsSt = arraySt.length;
        System.out.println(arrayLangsSt);

        System.out.println(arraySt[1]);
        System.out.println(array[1]);


        int[] array1 = new int[3];
        array1 [0] = 10;
        array1 [1]= 150;
        array1 [2]= 200;
        System.out.println(array1[0]);


    }
}
