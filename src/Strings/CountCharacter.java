package Strings;

public class CountCharacter {
    public static void main(String[] args) {
        String string = "pankaj is best";
        int count = 0;
        //count each character except space
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("No of characters in string = "+ count);
    }
}
