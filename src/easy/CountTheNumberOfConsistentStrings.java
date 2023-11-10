package easy;

import java.util.ArrayList;

public class CountTheNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {

        ArrayList<Character> arrList = new ArrayList<>();
        int counter = 0;

        for (Character c : allowed.toCharArray()) {
            arrList.add(c);
        }

        for (String word : words) {
            boolean consistent = true;
            for (int index = 0; index < word.length(); index++) {
                if (!arrList.contains(word.charAt(index))) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                counter++;
            }
        }

        return counter;
    }
}
