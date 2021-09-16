package Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = pow(x,n);
        System.out.println(xn);
    }

    private static int pow(int x, int n) {
        if(n == 0){
            return 1;
        }
        int xn1 = pow(x, n-1);
        return x*xn1;
    }
}
