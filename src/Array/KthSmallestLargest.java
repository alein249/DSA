package Array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestLargest {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 1, 9, 20, 6};
        int k = 6;
        System.out.println("Kth smallest element is: "+ kthSmallest(array,k));

    }
    public  static  int kthSmallest(int[] arr,int k){
        //sort the array
        Arrays.sort(arr);
        //return kth element from sorted array
        return arr[k-1];
    }
}
