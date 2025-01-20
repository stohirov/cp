package solutions.codewars;

import java.math.BigInteger;
import java.util.Arrays;

public class Kata {

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase.isEmpty()) return phrase;

        String[] words = phrase.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            str.append(s.substring(0, 1).toUpperCase()).append(s, 1, s.length());
            if (i < words.length - 1) str.append(" ");
        }
        return str.toString();
    }

    public static long maxProduct(int[] numbers, int sub_size)
    {
        Arrays.sort(numbers);
        int result = 1;
        for (int i = numbers.length - 1; i >= numbers.length - sub_size; i--) {
            result *= numbers[i];
        }
        return result;
    }

    public static String numPrimorial(int n) {
        BigInteger p = BigInteger.valueOf(2);
        BigInteger result = BigInteger.ONE;
        for(int i=0; i<n; ++i, p = p.nextProbablePrime())
            result = result.multiply(p);

        return result.toString();
    }

    public static long[] productArray(int[] numbers)
    {
        long[] res = new long[numbers.length];
        int curr = 0;
        for (int i = 0; i < res.length; i++) {
            long currValue = 1;
            for (int j = 0; j < res.length; j++) {
                if (j == curr) continue;
                currValue *= numbers[j];
            }
            res[i] = currValue;
            curr++;
        }
        return res;
    }


}
