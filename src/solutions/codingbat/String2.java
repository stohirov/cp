package solutions.codingbat;

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

}
