package homeWork.hw2.hw5;

public class Test10 {
    public static void main(String args[]){
        int array[] = new int[]{100, 110, 88, 22, 12, 120};

        int min = getMin(array);
        System.out.println("Minimum Value is: "+min);
    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}