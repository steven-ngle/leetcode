package easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean>numberOfCandies = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                numberOfCandies.add(true);
            } else {
                numberOfCandies.add(false);
            }
        }
        return numberOfCandies;
    }
}