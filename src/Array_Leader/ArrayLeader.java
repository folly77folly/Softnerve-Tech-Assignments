package Array_Leader;

import java.util.Arrays;

public class ArrayLeader {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 10, 6, 5, 2};
        int max =  arr[arr.length - 1];
        System.out.print(max + " ");
        for (int i = arr.length - 1; i >= 0 ; i--)

            {
                if(arr[i] > max){
                    max = arr[i];
                    System.out.print(max + " ");
                }
            }
    }
}
