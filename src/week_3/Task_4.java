package week_3;

public class Task_4 {

    public static int search(int[] arr,int key){
        int index = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                //count = count + 1;
               // index = i;
                return i;
            }
        }
      // return index;
      //  return count;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,7,1,9};
        System.out.println(search(arr, 1));
    }
}






