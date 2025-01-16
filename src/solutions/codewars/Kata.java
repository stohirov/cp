package solutions.codewars;

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


}
