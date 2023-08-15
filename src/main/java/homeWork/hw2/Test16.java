package homeWork.hw2;

public class Test16 {
        public static int[] addNumberToArray(int[] arr, int numberAdd) {
            int[] newArray = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            newArray[newArray.length - 1] = numberAdd;
            return newArray;
        }
        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5, 6};
            int number = 7;
            int[] resultArray = addNumberToArray(a, number);
            for (int num : resultArray) {
                System.out.print(num + " ");
            }
        }
}