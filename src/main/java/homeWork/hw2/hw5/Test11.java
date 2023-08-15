package homeWork.hw2.hw5;

public class Test11 {
    public static void main(String[] args) {
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