package solutions.codingbat;

public class WarmUp2 {

    public String stringTimes(String str, int n) {
        String res = "";
        while (n > 0) {
            res += str;
            n--;
        }
        return res;
    }

    public String frontTimes(String str, int n) {
        String res = "";
        int front = 3;
        while (n > 0) {
            if (str.length() > front) res += str.substring(0, front);
            else res += str;
            n--;
        }
        return res;
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("xx", i)) count++;
        }
        return count;
    }

    boolean doubleX(String str) {
        boolean isFollowedByX = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    return true;
                } else {
                    return isFollowedByX;
                }
            }
        }
        return isFollowedByX;
    }

    public String stringBits(String str) {
        String res = "";
        int i = 0;
        while (i < str.length()) {
            res += str.charAt(i);
            i += 2;
        }
        return res;
    }

    public String stringSplosion(String str) {
        String res = "";
        int i = 1;
        while (i <= str.length()) {
            res += str.substring(0, i);
            i++;
        }
        return res;
    }

    public int last2(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith(end, i)) count++;
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (num == 9) count++;
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int length = Math.min(nums.length, 4);
        for (int i = 0; i < length; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1) {
                if (nums[i + 1] == 2) {
                    if (nums[i + 2] == 3) return true;
                }
            }
        }
        return false;
    }

}
