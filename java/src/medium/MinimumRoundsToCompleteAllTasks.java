package medium;

import java.util.HashMap;

public class MinimumRoundsToCompleteAllTasks {

    public int minimumRounds(int[] tasks) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int task : tasks) {
            hm.put(task, hm.getOrDefault(task, 0) + 1);
        }

        int counter = 0;
        for (int val : hm.values()) {
            if (val == 1) return -1;

            counter += val / 3;
            if (val % 3 != 0) counter++;
        }

        return counter;
    }
}
