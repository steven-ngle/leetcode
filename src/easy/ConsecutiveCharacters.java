package easy;

public class ConsecutiveCharacters {

    public int maxPower(String s) {

        int max = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            int count = 1;
            int j = i + 1;
            while ((j < s.length()) && (s.charAt(i) == s.charAt(j))) {
                count++;
                j++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
