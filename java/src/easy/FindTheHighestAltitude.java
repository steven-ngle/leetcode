package easy;

public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {

        int max = 0;
        int current = 0;
        int i = 0;

        while (i < gain.length) {
            current += gain[i];
            if (max < current) {
                max = current;
            }
            i++;
        }

        return max;
    }
}
