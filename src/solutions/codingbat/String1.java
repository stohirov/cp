package solutions.codingbat;

public class String1 {
    public String helloName(String name) {
        return "Hello " + name.concat("!");
    }

    public String makeAbba(String a, String b) {
        String first = a + b;
        String second = b + a;
        return first.concat(second);
    }

    public String makeTags(String tag, String word) {
        String firstTag = "<" + tag + ">";
        String secondTag = "</" + tag + ">";
        return firstTag + word + secondTag;
    }

    public String makeOutWord(String out, String word) {
        String toMid = out.substring(0,(out.length()/2));
        String fromMid = out.substring(out.length()/2);
        return toMid + word + fromMid;
    }

    public String extraEnd(String str) {
        return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0,2);
    }

    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }

    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            String txt = b + a;
            return txt.concat(b);
        } else {
            String txt = a + b;
            return txt.concat(a);
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        String txt = str.substring(0,2);
        String last = str.substring(2);
        return last.concat(txt);
    }

    public String right2(String str) {
        String first = str.substring(str.length()-2);
        String last = str.substring(0,str.length()-2);
        return first + last;
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);
    }

    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        }
        return str.substring(1,str.length()-1);
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2-1,(str.length() / 2+1));
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        return str.length() - 1 > index && index > 0 ? str.substring(index, index + 2) : str.substring(0, 2);
    }



}
