package easy;

import java.util.Comparator;
import java.util.PriorityQueue;


public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i : stones) {
            pq.add(i);
        }

        while (pq.size() > 1) {
            int y = pq.remove();
            int x = pq.remove();

            if (x != y) {
                pq.add(y - x);
            }
        }

        if (pq.isEmpty()) {
            return 0;
        } else {
            return pq.peek();
        }
    }
}
