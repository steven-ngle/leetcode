package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {

        String[] res = new String[score.length];
        int[] sortedScores = Arrays.copyOf(score, score.length);
        Arrays.sort(sortedScores);
        Map<Integer, String> rankMap = new HashMap<>();

        for (int i = 0; i < sortedScores.length; i++) {
            int rank = sortedScores.length - i;
            if (rank == 1)
                rankMap.put(sortedScores[i], "Gold Medal");
            else if (rank == 2)
                rankMap.put(sortedScores[i], "Silver Medal");
            else if (rank == 3)
                rankMap.put(sortedScores[i], "Bronze Medal");
            else
                rankMap.put(sortedScores[i], String.valueOf(rank));
        }

        for (int i = 0; i < score.length; i++) {
            res[i] = rankMap.get(score[i]);
        }

        return res;
    }
}
