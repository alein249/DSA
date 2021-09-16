package Recursion;

import java.util.Scanner;

public class LogPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = pow(x, n);
        System.out.println(xn);

    }

    private static int pow(int x, int n) {
        if(n == 0){
            return 1;
        }
        int xpnb2 = pow(x, n/2);
        int xn = xpnb2*xpnb2;

        if(n%2 == 1){
            xn = xn*x;
        }
        return xn;
    }
}
