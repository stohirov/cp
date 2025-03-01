package solutions.codingbat;

import java.util.Stack;

public class String2 {
    public String doubleChar(String str) {
        String sum = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sum += str.charAt(i) + str.substring(i,i+1);
        }
        return sum;
    }

    public int countHi(String str) {
        int length = str.length();
        int count = 0;
        for (int i = 0; i < length-1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int length = str.length();
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < length-2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        return countCat == countDog;
    }

    public int countCode(String str) {
        int countCode = 0;
        int length = str.length();
        for (int i = 0; i < length-3; i++) {
            if (str.substring(i,i+2).equals("co") &&
                    str.charAt(i + 3) == 'e')
                countCode++;
        }
        return countCode;
    }

    public boolean endOther(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        return (lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA));
    }

    public boolean xyzThere(String str) {
        String x = str.replaceAll("\\.xyz", "");
        return x.contains("xyz");
    }

    public boolean bobThere(String str) {
        int length = str.length();
        for (int i = 0; i < length-2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        if (!str.contains("x") && !str.contains("y")) return true;

        int indexX = -1;
        int indexY = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') indexX = i;
            if (str.charAt(i) == 'y') indexY = i;
        }
        return indexX < indexY;
    }

    public String mixString(String a, String b) {
        String res = "";
        int length = Math.min(a.length(), b.length());
        for(int i=0; i<length; i++){
            res = res + a.charAt(i)+b.charAt(i);
        }

        if(a.length() > length){
            res += a.substring(length);
        }else{
            res += b.substring(length);
        }

        return res;
    }

    public String repeatEnd(String str, int n) {
        String response = "";
        for (int i = 0; i < n; i++) {
            response += str.substring(str.length()-n);
        }
        return response;
    }

}
