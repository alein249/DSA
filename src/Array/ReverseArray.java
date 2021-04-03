package Array;

public class ReverseArray {
    public static void main(String[] args) {
        //initialize array
        int[] array = {2,3,4,5};
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
