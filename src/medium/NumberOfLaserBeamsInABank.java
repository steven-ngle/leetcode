package medium;

public class NumberOfLaserBeamsInABank {

    public int numberOfBeams(String[] bank) {
        int max = 0;
        int prev = 0;

        for (String beam : bank) {
            int counter = 0;
            for (char c : beam.toCharArray()) {
                if (c == '1') {
                    counter++;
                }
            }
            max += counter * prev;
            if (counter > 0) {
                prev = counter;
            }
        }

        return max;
    }
}
