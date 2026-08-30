package easy;

public class MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String sentence : sentences) {
            int wordCount = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    wordCount++;
                }
            }
            max = Math.max(max, wordCount + 1);
        }

        return max;
    }
}
