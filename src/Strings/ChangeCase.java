package Strings;

public class ChangeCase {
    public static void main(String[] args) {
        String str = "PanKaj is BEst";
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                sb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                sb.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println("Final string = "+ sb);
    }
}
