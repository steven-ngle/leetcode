package easy;

public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int result = duration;

        for(int i = 0; i < timeSeries.length - 1; i++) {
            if(timeSeries[i] + duration <= timeSeries[i+1]) {
                result += duration;
            } else {
                result += timeSeries[i+1] - timeSeries[i];
            }
        }

        return result;
    }
}
