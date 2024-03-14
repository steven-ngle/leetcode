package easy;

public class CheckIfWordEqualsSummationOfTwoWords {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return conv(firstWord) + conv(secondWord) == conv(targetWord);
    }

    private int conv(String word) {
        int res = 0;
        for (char c : word.toCharArray()) {
            res = res * 10 + (c - 'a');
        }

        return res;
    }
}
