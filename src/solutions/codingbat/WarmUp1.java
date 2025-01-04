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

    public String frontBack(String str) {
        int length = str.length();
        if (length <= 1) return str;
        String mid = str.substring(1, length - 1);
        return str.charAt(length - 1) + mid + str.charAt(0);
    }

    public String front3(String str) {
        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < 3) {
            if (str.length() >= 3) {
                res.append(str, 0, 3);
            } else {
                res.append(str);
            }
            i++;
        }
        return res.toString();
    }

    public String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        if (str.length() < 2) return str + str + str;
        else return str.substring(0, 2) + str + str.substring(0, 2);
    }

    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        return str.substring(0, 2).equals("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public boolean in1020(int a, int b) {
        boolean isAIn = a >= 10 && a <= 20;
        boolean isBIn = b >= 10 && b <= 20;
        return isAIn || isBIn;
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = a >= 13 && a <= 19;
        boolean bTeen = b >= 13 && b <= 19;
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public String delDel(String str) {
        if (str.length() < 3) return str;
        int index = str.indexOf("del");
        if (index == 1) return str.substring(0, index) + str.substring(index + 3);
        else return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        return str.startsWith("ix", 1);
    }

}
