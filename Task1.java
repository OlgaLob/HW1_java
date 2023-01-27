package HW1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        int length = 10;
        int[] arr = new int[length];
        for (int i=0; i<arr.length; i++){
            arr[i] = (int) Math.floor(Math.random()*10);
        }
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(minMax(arr)));
    }
    static int[] minMax(int[] array){
        int min = array[0];
        int max = array[0];
        for (int item: array) {
            if (item<min) min = item;
            if (item>max) max = item;
        }
        return new int[] {min, max};
    }

}
