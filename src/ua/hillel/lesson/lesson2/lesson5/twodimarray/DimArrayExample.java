package ua.hillel.lesson.lesson2.lesson5.twodimarray;

public class DimArrayExample {
    public static void main(String[] args) {

 /*       int [][] twoDimArray2 = new int[3][4];
        twoDimArray2[0][0] =5;
        twoDimArray2[0][1] =6;
        twoDimArray2[0][2] =7;
        twoDimArray2[0][3] =1;
        twoDimArray2[1][0] =52;
        twoDimArray2[1][1] =53;
        twoDimArray2[1][2] =53;
        twoDimArray2[1][3] =54;
        twoDimArray2[2][0] =54;
        twoDimArray2[2][1] =55;
        twoDimArray2[2][2] =5;
        twoDimArray2[2][3] =5;   */


        method();
    }


    public static void method() {

        int[][] twoDimArray = {{15, 46, 27, 61},
                               {52, 53, 53, 54},
                               {55, 55, 59, 25}};


        for (int i = 0; i < twoDimArray.length; i++) {
            for (int k = 0; k < twoDimArray[i].length; k++) {
                System.out.print(" " + twoDimArray[i][k] + " ");
            }
            System.out.println();
        }
    }
}
