package Strings;

public class Class {
    static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str){
        int[] arr = new int[ASCII_SIZE];
        int len = str.length();
        for(int i = 0; i < len; i++){
            arr[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for(int i =0; i < len; i++){
            if(max < arr[str.charAt(i)]){
                max = arr[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "pankaj best";
        System.out.println("Character with maximum occurence = "+ getMaxOccuringChar(str));
    }
}
