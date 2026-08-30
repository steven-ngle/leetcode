package easy;

public class MaximumRepeatingSubstring {

    public int maxRepeating(String sequence, String word) {

        int count = 0;
        String repWord = word;

        while (sequence.contains(repWord)) {
            count++;
            repWord += word;
        }

        return count;
    }
}
