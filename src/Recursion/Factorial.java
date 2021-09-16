package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println(f);
    }

    private static int fact(int n) {
        if(n == 1){
            return  1;
        }
        int f1 = fact(n-1);
        return n*f1;
    }
}
