package HW1;

public class Task3 {
    public static void main(String[] args){
        int[] numbs = new int[]{3,2,2,3,1,4,8,3,2,6,33};
        int val = 3;
        int[] newNumbs = valEnd(numbs, val);
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(newNumbs[i] + " ");
        }
    }
    static int[] valEnd(int[] arr, int num){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            while (left<right && arr[right] == num) right--;
            if (arr[left] == num) swap(arr, left, right);
            left++;
        }
        return arr;
    }

    static int[] swap(int[] arr, int left, int right){
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
        return arr;
    }
}
