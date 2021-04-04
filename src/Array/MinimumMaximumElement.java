package Array;

public class MinimumMaximumElement {
    public static void main(String[] args) {
        int[] array = {4,5,2,8,3,19,1};
        int min = array[0];
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Minimum element: "+ min);
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Maximum element: "+ max);
    }
}
