package solutions.codingbat;

public class WarmUp1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public int sumDouble(int a, int b) {
        return (a == b) ? 2*(a+b) : a + b;
    }

    public int diff21(int n) {
        return (n > 21) ? (2 * (n-21)) : (21-n);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public boolean makes10(int a, int b) {
        int sum = a + b;
        return a == 10 || b == 10 || sum == 10;
    }

    public boolean nearHundred(int n) {
        return (n <= 110 && n >= 90) || (n >= 190 && n <= 210);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

}
