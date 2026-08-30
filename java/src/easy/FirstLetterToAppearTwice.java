package easy;

import java.util.HashMap;

public class FirstLetterToAppearTwice {

    public char repeatedCharacter(String s) {

        char res = ' ';
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            if (hm.get(arr[i]) > 1) {
                res = arr[i];
                break;
            }
        }

        return res;
    }
}
