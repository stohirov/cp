package solutions.leetcode;

public class Solution50 {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(Math.abs(x-0.0)<0.0000001) return 0.0;
        if(Math.abs(x-1.0)<0.0000001) return 1.0;

        if(n < 0) x = 1.0/x;
        return Power(x, Math.abs(n));
    }

    double Power(double x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;

        return ((n&0x1) == 1) ? x*Power(x*x, n/2) : Power(x*x, n/2);
    }
}
