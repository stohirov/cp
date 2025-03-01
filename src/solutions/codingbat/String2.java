package solutions.codingbat;

public class String2 {
    public String doubleChar(String str) {
        String sum = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sum += str.substring(i,i+1) + str.substring(i,i+1);
        }
        return sum;
    }
}
