package easy;

import java.util.HashMap;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {

        int res = 0;

        for (Character c : t.toCharArray()) {
            res += c;
        }

        for (Character c : s.toCharArray()) {
            res -= c;
        }

        return (char) res;
    }
}
