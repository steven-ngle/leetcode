package medium;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    /** Time Limit Exceeded
    public int maxVowels(String s, int k) {

        int left = 0;
        int max = 0;

        while (left + k <= s.length()) {
            String sub = s.substring(left, left + k);
            int counter = 0;

            for (int i = 0; i < sub.length(); i++) {
                if (isVowel(sub.charAt(i))) {
                    counter++;
                }
            }

            if (counter > max) max = counter;
            left++;
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
     **/

    public int maxVowels(String s, int k) {

        int counter = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) counter++;
        }

        int max = counter;
        int left = 0;
        int right = k - 1;
        while (right < s.length() - 1) {
            if (isVowel(s.charAt(left))) counter--;
            left++;
            right++;
            if (isVowel(s.charAt(right))) counter++;
            max = Math.max(max, counter);
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
