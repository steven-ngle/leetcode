package easy;

public class MaximumScoreAfterSplittingAString {

    public int maxScore(String s) {

        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int currentScore = 0;

            for (int j = 0; j <= i; j++) {
                if(s.charAt(j) == '0') {
                    currentScore++;
                }
            }

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    currentScore++;
                }
            }

            score = Math.max(score, currentScore);
        }

        return score;
    }
}
