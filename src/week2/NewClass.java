package week2;

public class NewClass {
    public static void swapMaxAndMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        arr[minIndex] = max;
        arr[maxIndex] = min;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,8,11,9};
        swapMaxAndMin(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}