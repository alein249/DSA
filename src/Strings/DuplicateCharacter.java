package Strings;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "aabcdd  ee";
        int count;
        char[] string = str.toCharArray();
        System.out.println("Duplicate character in string : ");
        for (int i = 0; i < string.length; i++){
            count = 1;
            for(int j = i+1; j < string.length; j++){
                if(string[i] == string[j] && string[i] != ' '){
                    count++;
                    string[j] = '0';
                }
            }
            if(count > 1 && string[i] != '0'){
                System.out.println(string[i]);
            }
        }
    }
}
